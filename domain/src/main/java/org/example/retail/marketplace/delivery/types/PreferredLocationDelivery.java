package org.example.retail.marketplace.delivery.types;

import org.example.retail.marketplace.delivery.DeliveryTypeOption;

public class PreferredLocationDelivery extends DeliveryType {
    private final double addressId;

    public PreferredLocationDelivery(double addressId) {
        this.addressId = addressId;
        this.deliveryTypeOption = DeliveryTypeOption.SHIP_TO_ADDRESS;
        this.deliveryTypeId = Math.random();
    }
}
