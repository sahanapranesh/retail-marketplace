package org.example.retail.marketplace.delivery;

import java.util.UUID;

public class ElectronicDelivery extends DeliveryType {
    private final String deliveryEmailAddress;

    public ElectronicDelivery(String deliveryEmailAddress) {
        this.deliveryEmailAddress = deliveryEmailAddress;
        this.deliveryTypeOption = DeliveryTypeOption.ELECTRONIC_DELIVERY;
        this.deliveryTypeId = UUID.randomUUID().toString();
    }
}
