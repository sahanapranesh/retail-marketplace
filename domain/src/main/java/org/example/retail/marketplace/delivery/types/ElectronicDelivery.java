package org.example.retail.marketplace.delivery.types;

import org.example.retail.marketplace.delivery.DeliveryTypeOption;

public class ElectronicDelivery extends DeliveryType {
    private final String deliveryEmailAddress;

    public ElectronicDelivery(String deliveryEmailAddress) {
        this.deliveryEmailAddress = deliveryEmailAddress;
        this.deliveryTypeOption = DeliveryTypeOption.ELECTRONIC_DELIVERY;
        this.deliveryTypeId = Math.random();
    }
}
