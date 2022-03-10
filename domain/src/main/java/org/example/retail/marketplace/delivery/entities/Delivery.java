package org.example.retail.marketplace.delivery.entities;

import lombok.Getter;

@Getter
public class Delivery {
    private double deliveryId;
    private String orderId;
    private DeliveryStatus status;
    private double deliveryTypeId;

    public Delivery(String orderId, double deliveryTypeId) {
        this.orderId = orderId;
        this.status = DeliveryStatus.SCHEDULED;
        this.deliveryTypeId = deliveryTypeId;
        this.deliveryId = Math.random();
    }

    public void updateStatus(DeliveryStatus status) {
        this.status = status;
    }
}
