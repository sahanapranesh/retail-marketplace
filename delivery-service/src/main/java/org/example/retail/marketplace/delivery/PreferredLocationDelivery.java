package org.example.retail.marketplace.delivery;

import java.util.UUID;

public class PreferredLocationDelivery extends DeliveryType {
    private final String addressId;

    public PreferredLocationDelivery(String addressId) {
        this.addressId = addressId;
        this.deliveryTypeOption = DeliveryTypeOption.SHIP_TO_ADDRESS;
        this.deliveryTypeId = UUID.randomUUID().toString();
    }
}
