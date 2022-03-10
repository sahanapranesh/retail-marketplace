package org.example.retail.marketplace.delivery;

public abstract class DeliveryType {
    protected String deliveryTypeId;
    protected DeliveryTypeOption deliveryTypeOption;

    public String getDeliveryTypeId() {
        return deliveryTypeId;
    }
}
