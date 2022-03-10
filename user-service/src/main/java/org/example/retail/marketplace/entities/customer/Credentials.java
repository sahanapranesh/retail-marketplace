package org.example.retail.marketplace.entities.customer;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Credentials {
    private String credentialsId;
    private String username;
    private String password;
    private String authenticationType;

    public Credentials(String username, String password) {
        this.credentialsId = UUID.randomUUID().toString();
        this.username = username;
        this.password = password;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }
}
