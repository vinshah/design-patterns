package com.patterns.behavioral.strategy.domain;

import lombok.Data;

@Data
public class CreditCard {
    private Integer id;
    private String cardHolder;
    private String cardNumber;
    private String expiryDate;
    private Integer cvv;
    private Double amount = 1000.00;

    public CreditCard(Integer id, String testUser, String cardNumber, String expiryDate, Integer cvv) {
        this.id = id;
        this.cardHolder = testUser;
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;

    }
}
