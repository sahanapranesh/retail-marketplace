package org.example.retail.marketplace.delivery.entities;

public abstract class DeliveryType {
    protected double deliveryTypeId;
    protected DeliveryTypeOption deliveryTypeOption;

    public double getDeliveryTypeId() {
        return deliveryTypeId;
    }
}
