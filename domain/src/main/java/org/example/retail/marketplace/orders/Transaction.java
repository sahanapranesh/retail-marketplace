package org.example.retail.marketplace.orders;

import lombok.Data;

@Data
public class Transaction {
    private int transactionId;
    private int paymentModeId;
    private int orderId;
    private PaymentStatus paymentStatus;
}
