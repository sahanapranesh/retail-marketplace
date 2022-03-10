package org.example.retail.marketplace.delivery.entities;

public class PreferredLocationDelivery extends DeliveryType {
    private final double addressId;

    public PreferredLocationDelivery(double addressId) {
        this.addressId = addressId;
        this.deliveryTypeOption = DeliveryTypeOption.SHIP_TO_ADDRESS;
        this.deliveryTypeId = Math.random();
    }
}
