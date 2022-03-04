package org.example.retail.marketplace.customer;

import lombok.Data;

@Data
public class Address {
    private int addressId;
    private String line1;
    private String line2;
    private String line3;
    private String country;
    private String postcode;
    private String label;
}
