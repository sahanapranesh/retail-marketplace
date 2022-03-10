package org.example.retail.marketplace.orders.entities;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    PAYMENT_INITIATED,
    PAYMENT_COMPLETED,
    PAYMENT_DECLINED,
    REFUND_PROCESSED
}
