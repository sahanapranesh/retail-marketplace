package org.example.retail.marketplace.entities.customer;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Address {
    private String addressId;
    private String line1;
    private String line2;
    private String line3;
    private String country;
    private String postcode;
    private String label;

    public Address(String line1, String line2, String country, String postcode) {
        this.line1 = line1;
        this.line2 = line2;
        this.country = country;
        this.postcode = postcode;
        this.addressId = UUID.randomUUID().toString();
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    public void setLabel(String label) {
        this.label = label;
    }

}
