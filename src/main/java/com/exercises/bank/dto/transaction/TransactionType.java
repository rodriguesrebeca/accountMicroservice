package com.exercises.bank.dto.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum TransactionType {

    TED("Ted"), PIX("Pix"), DEPOSIT("Deposit"), DOC("Doc");
    private String label;
}
