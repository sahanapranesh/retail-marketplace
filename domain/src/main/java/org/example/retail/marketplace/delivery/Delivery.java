package org.example.retail.marketplace.delivery;

import lombok.Getter;

@Getter
public class Delivery {
    private double deliveryId;
    private double orderId;
    private DeliveryStatus status;
    private double deliveryTypeId;

    public Delivery(double orderId, double deliveryTypeId) {
        this.orderId = orderId;
        this.status = DeliveryStatus.SCHEDULED;
        this.deliveryTypeId = deliveryTypeId;
        this.deliveryId =  Math.random();
    }

    public void updateStatus(DeliveryStatus status) {
        this.status = status;
    }
}
