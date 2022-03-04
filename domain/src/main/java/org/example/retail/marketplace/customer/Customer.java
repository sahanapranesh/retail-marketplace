package org.example.retail.marketplace.customer;

import lombok.Data;

import java.util.List;

@Data
public class Customer {
    private int customerId;
    private String name;
    private int authenticationModeId;
    private List<Address> addresses;
    private List<PaymentMode> paymentModes;

}
