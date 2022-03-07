package org.example.retail.marketplace.delivery.types;

import org.example.retail.marketplace.delivery.DeliveryTypeOption;

public abstract class DeliveryType {
    protected double deliveryTypeId;
    protected DeliveryTypeOption deliveryTypeOption;

    public double getDeliveryTypeId() {
        return deliveryTypeId;
    }
}
