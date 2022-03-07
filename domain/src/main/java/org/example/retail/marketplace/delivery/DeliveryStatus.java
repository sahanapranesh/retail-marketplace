package org.example.retail.marketplace.delivery;

import lombok.Getter;

@Getter
public enum DeliveryStatus {
    SCHEDULED,
    SHIPPED,
    OUT_FOR_DELIVERY,
    UNABLE_TO_DELIVER,
    DELIVERED
}
