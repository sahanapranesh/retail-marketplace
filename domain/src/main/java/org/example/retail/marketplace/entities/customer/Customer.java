package org.example.retail.marketplace.entities.customer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Customer {
    private double customerId;
    private String firstName;
    private String lastName;
    private double credentialsId;
    private List<Address> addresses;
    private List<PaymentMode> paymentModes;

    public Customer(double credentialsId) {
        this.credentialsId = credentialsId;
        this.customerId = Math.random();
        addresses = new ArrayList<>();
        paymentModes = new ArrayList<>();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void addAddress(Address address) {
        addresses.add(address);
    }

    public void addPaymentMode(PaymentMode paymentMode) {
        paymentModes.add(paymentMode);
    }
}
