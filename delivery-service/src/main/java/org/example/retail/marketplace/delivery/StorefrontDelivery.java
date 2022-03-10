package org.example.retail.marketplace.delivery;

import java.util.UUID;

public class StorefrontDelivery extends DeliveryType {
    private final String storeFrontId;

    public StorefrontDelivery(String storeFrontId) {
        this.storeFrontId = storeFrontId;
        this.deliveryTypeOption = DeliveryTypeOption.STORE_PICKUP;
        this.deliveryTypeId = UUID.randomUUID().toString();
    }
}
