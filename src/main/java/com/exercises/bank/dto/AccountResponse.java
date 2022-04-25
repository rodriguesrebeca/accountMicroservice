package com.exercises.bank.dto;

import com.exercises.bank.dto.transaction.Transaction;
import com.exercises.bank.model.Account;
import com.exercises.bank.model.AccountType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {

    @JsonProperty(value = "number")
    private String number;
    private Integer id;
    private Integer agency;
    private AccountType accountType;
    private BigDecimal balance;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Transaction transactions;

    public AccountResponse(Account account) {
        this.number = account.getNumber();
        this.id = account.getId();
        this.agency = account.getAgency();
        this.accountType = account.getAccountType();
        this.balance = account.getBalance();
        this.createdDate = account.getCreatedDate();
        this.updatedDate = account.getUpdatedDate();
    }

    public AccountResponse(Account account, Transaction transaction){
        this.number = account.getNumber();
        this.id = account.getId();
        this.agency = account.getAgency();
        this.accountType = account.getAccountType();
        this.balance = account.getBalance();
        this.createdDate = account.getCreatedDate();
        this.updatedDate = account.getUpdatedDate();
        this.transactions = transaction;
    }


}
