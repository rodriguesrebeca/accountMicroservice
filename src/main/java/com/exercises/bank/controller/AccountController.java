package com.exercises.bank.controller;

import com.exercises.bank.dto.AccountRequest;
import com.exercises.bank.dto.AccountResponse;
import com.exercises.bank.model.Account;
import com.exercises.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountService accountService;

    @PostMapping("/new")
    public AccountResponse create(@RequestBody AccountRequest accountRequest){
        return accountService.create(accountRequest);
    }

    @GetMapping("/{number}")
    public List<Account> getByNumber(@PathVariable String number){
        return accountService.getByNumber(number);
    }
}
