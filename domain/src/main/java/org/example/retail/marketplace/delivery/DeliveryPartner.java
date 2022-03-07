package org.example.retail.marketplace.delivery;

import lombok.Getter;

@Getter
public class DeliveryPartner {
    private double deliveryPartnerId;
    private String name;
    private long phoneNumber;
    private String email;

    public DeliveryPartner(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.deliveryPartnerId =  Math.random();
    }

    public void updatePhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        this.email = email;
    }
}
