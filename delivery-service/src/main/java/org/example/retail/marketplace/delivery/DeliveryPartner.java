package org.example.retail.marketplace.delivery;

import lombok.Getter;

import java.util.UUID;

@Getter
public class DeliveryPartner {
    private String deliveryPartnerId;
    private String name;
    private long phoneNumber;
    private String email;

    public DeliveryPartner(String name, long phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.deliveryPartnerId = UUID.randomUUID().toString();
    }

    public void updatePhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void updateEmail(String email) {
        this.email = email;
    }
}
