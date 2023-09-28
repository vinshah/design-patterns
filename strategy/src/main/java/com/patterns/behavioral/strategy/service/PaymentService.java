package com.patterns.behavioral.strategy.service;

import com.patterns.behavioral.strategy.strategy.PaymentStrategy;
import lombok.Setter;

@Setter
public class PaymentService {
    private Double cost;
    private boolean includeDelivery = true;

    private PaymentStrategy strategy;

    public void processOrder(Double cost) {
        this.cost = cost;
        strategy.collectPaymentDetails();
        if (strategy.validatePaymentDetails()) {
            strategy.pay(getTotal());
        }
    }

    private Double getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
