package com.exercises.bank.service;

import com.exercises.bank.dto.AccountRequest;
import com.exercises.bank.dto.AccountResponse;
import com.exercises.bank.model.Account;

import java.util.List;

public interface AccountService {
    AccountResponse create(AccountRequest accountRequest);

    List<Account> getByNumber(String accountRequest);
}
