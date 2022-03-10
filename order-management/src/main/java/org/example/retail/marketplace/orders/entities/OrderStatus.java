package org.example.retail.marketplace.orders.entities;

import lombok.Getter;

@Getter
public enum OrderStatus {
    ORDERED(1),
    PAYMENT_PENDING(2),
    SCHEDULED_FOR_DELIVERY(3),
    SHIPPED(4),
    DELIVERY_IN_PROGRESS(5),
    DELIVERED(6),
    RETURN_REQUEST_PLACED(7),
    RETURN_COMPLETE(8),
    CANCELLED(9);


    private int id;

    OrderStatus(int id) {
        this.id = id;
    }
}
