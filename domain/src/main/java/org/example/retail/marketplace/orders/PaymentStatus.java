package org.example.retail.marketplace.orders;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    PAYMENT_INITIATED,
    PAYMENT_COMPLETED,
    PAYMENT_DECLINED
}
