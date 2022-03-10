package org.example.retail.marketplace.delivery;

import lombok.Getter;

import java.util.UUID;

@Getter
public class PickupStore {
    private String pickUpStoreId;
    private String pickupStoreName;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String postCode;
    private String country;

    public PickupStore(String pickupStoreName, String addressLine1, String addressLine2, String postCode, String country) {
        this.pickupStoreName = pickupStoreName;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.postCode = postCode;
        this.country = country;
        this.pickUpStoreId = UUID.randomUUID().toString();
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }
}
