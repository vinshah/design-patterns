package com.patterns.behavioral.strategy.strategy;

public class PaymentByPayPal implements PaymentStrategy {

    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        // Pop-up to collect PayPal mail and password...
        email = "PayPal Mail";
        password = "PayPal Password";
        System.out.println("Collecting PayPal Account Details...");
    }

    @Override
    public boolean validatePaymentDetails() {
        // Validate account...
        System.out.printf("Validating PayPal Info: %s | %s%n", email, password);
        return true;
    }

    @Override
    public void pay(Double amount) {
        System.out.println("Paying " + amount + " using PayPal");
    }
}
