package com.patterns.behavioral.strategy.strategy;

import com.patterns.behavioral.strategy.domain.CreditCard;

public class PaymentByCreditCard implements PaymentStrategy{
    private CreditCard card;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect card details...
        card = new CreditCard(1, "test user", "cardNumber", "expiryDate", 433);
        System.out.println("Collecting Card Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate credit card...
        System.out.println("Validating Card Info: " + card);
        return true;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Paying " + amount + " using Credit Card");
        card.setAmount(card.getAmount() - amount);

    }
}
