package org.example.retail.marketplace.delivery.types;

import org.example.retail.marketplace.delivery.DeliveryTypeOption;

public class StorefrontDelivery extends DeliveryType {
    private final double storeFrontId;

    public StorefrontDelivery(double storeFrontId) {
        this.storeFrontId = storeFrontId;
        this.deliveryTypeOption = DeliveryTypeOption.STORE_PICKUP;
        this.deliveryTypeId = Math.random();
    }
}
