package org.example.retail.marketplace.orders;

import lombok.Getter;

@Getter
public enum PaymentStatus {
    PAYMENT_PENDING,
    PAYMENT_COMPLETED,
    PAYMENT_DECLINED
}
