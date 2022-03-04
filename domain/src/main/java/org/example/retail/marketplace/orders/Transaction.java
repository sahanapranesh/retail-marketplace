package org.example.retail.marketplace.orders;

import lombok.Getter;

@Getter
public class Transaction {
    private double transactionId;
    private double paymentModeId;
    private double orderId;
    private PaymentStatus paymentStatus;

    public Transaction(double paymentModeId, double orderId) {
        this.paymentModeId = paymentModeId;
        this.orderId = orderId;
        this.transactionId =  Math.random();
        paymentStatus = PaymentStatus.PAYMENT_INITIATED;
    }

    public void updatePaymentStatus(PaymentStatus paymentStatus){
        this.paymentStatus =  paymentStatus;
    }
}
