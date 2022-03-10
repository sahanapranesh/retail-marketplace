package org.example.retail.marketplace.entities.customer;

import lombok.Getter;

@Getter
public class Credentials {
    private double credentialsId;
    private String username;
    private String password;
    private String authenticationType;

    public Credentials(String username, String password) {
        this.credentialsId = Math.random();
        this.username = username;
        this.password = password;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }
}
