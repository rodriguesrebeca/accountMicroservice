package com.exercises.bank.service.impl;

import com.exercises.bank.dto.transaction.Transaction;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GetTransaction {

    public Transaction execute(String number){

        String url = "http://localhost:8080/transaction/{number}";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set(HttpHeaders.ACCEPT, MediaType.APPLICATION_JSON_VALUE);
        HttpEntity<?> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<Transaction> transaction = restTemplate.exchange(url,
                HttpMethod.GET,
                entity,
                Transaction.class,
                number);

        if(transaction.getStatusCode().isError()){
            return null;
        }
        return transaction.getBody();
    }
}
