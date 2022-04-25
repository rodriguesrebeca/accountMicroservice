package com.exercises.bank.dto;

import com.exercises.bank.model.AccountType;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountRequest {

    private String number;
    private Integer agency;
    private BigDecimal balance;
    private AccountType accountType;

}
