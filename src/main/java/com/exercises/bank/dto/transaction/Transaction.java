package com.exercises.bank.dto.transaction;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "transaction")
@Entity
public class Transaction {

    @JsonProperty("id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @JsonProperty("value")
    private double value;
    @JsonProperty("transactionType")
    private TransactionType transactionType;
    @JsonProperty("transactionStatus")
    private TransactionStatus transactionStatus;
    @JsonProperty("number")
    private String number;
    @JsonProperty("agency")
    private Integer agency;
    @JsonProperty("createdDate")
    private LocalDateTime createdDate;
    @JsonProperty("updatedDate")
    private LocalDateTime updatedDate;

}
