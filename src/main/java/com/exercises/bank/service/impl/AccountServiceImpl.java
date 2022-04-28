package com.exercises.bank.service.impl;

import com.exercises.bank.dto.AccountRequest;
import com.exercises.bank.dto.AccountResponse;
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


    @Override
    public AccountResponse create(AccountRequest accountRequest) {
        Account account = new Account(accountRequest);
        return new AccountResponse(accountRepository.save(account));
    }

    @Override
    public List<Account> getAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account getById(Integer id){
        return accountRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Account> getByNumber(String number){
        return accountRepository.findAccountByNumber(number);
    }

    @Override
    public void delete(Integer id){
        Account account = accountRepository.findById(id).orElseThrow();
        accountRepository.delete(account);
    }
}
