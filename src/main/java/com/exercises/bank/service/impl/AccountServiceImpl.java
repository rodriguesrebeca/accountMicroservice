package com.exercises.bank.service.impl;

import com.exercises.bank.dto.AccountRequest;
import com.exercises.bank.dto.AccountResponse;
import com.exercises.bank.dto.transaction.Transaction;
import com.exercises.bank.dto.transaction.TransactionStatus;
import com.exercises.bank.model.Account;
import com.exercises.bank.repository.AccountRepository;
import com.exercises.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    GetTransaction getTransaction;

    @Override
    public AccountResponse create(AccountRequest accountRequest) {
        Transaction transaction = getTransaction.execute(accountRequest.getNumber());
        Account account = new Account(accountRequest, transaction);
        return new AccountResponse(accountRepository.save(account));
    }

    @Override
    public List<Account> getByNumber(String number){
        return accountRepository.findAccountByNumber(number);
    }

}
