package org.example.retail.marketplace.orders.entities;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Transaction {
    private String transactionId;
    private String paymentModeId;
    private String orderId;
    private PaymentStatus paymentStatus;

    public Transaction(String paymentModeId, String orderId) {
        this.paymentModeId = paymentModeId;
        this.orderId = orderId;
        this.transactionId = UUID.randomUUID().toString();
        paymentStatus = PaymentStatus.PAYMENT_INITIATED;
    }

    public void updatePaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
