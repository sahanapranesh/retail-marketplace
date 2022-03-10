package org.example.retail.marketplace.delivery;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Delivery {
    private String deliveryId;
    private String orderId;
    private DeliveryStatus status;
    private String deliveryTypeId;

    public Delivery(String orderId, String deliveryTypeId) {
        this.orderId = orderId;
        this.status = DeliveryStatus.SCHEDULED;
        this.deliveryTypeId = deliveryTypeId;
        this.deliveryId = UUID.randomUUID().toString();
    }

    public void updateStatus(DeliveryStatus status) {
        this.status = status;
    }
}
