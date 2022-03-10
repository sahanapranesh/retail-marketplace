package org.example.retail.marketplace.entities.customer;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class Customer {
    private String customerId;
    private String firstName;
    private String lastName;
    private String credentialsId;
    private List<Address> addresses;
    private List<PaymentMode> paymentModes;

    public Customer(String credentialsId) {
        this.credentialsId = credentialsId;
        this.customerId = UUID.randomUUID().toString();
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
