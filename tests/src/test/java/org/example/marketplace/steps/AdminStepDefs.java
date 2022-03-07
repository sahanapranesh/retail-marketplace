package org.example.marketplace.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.retail.marketplace.delivery.DeliveryPartner;
import org.example.retail.marketplace.delivery.PickupStore;

import static org.junit.Assert.assertNotNull;

public class AdminStepDefs {
    private String storeFrontName;
    private String addressLine1;
    private String addressLine2;
    private String postCode;
    private String country;
    private String deliveryPartnerName;
    private long deliveryPartnerPhone;
    private String deliveryPartnerEmail;

    @Given("I am an admin user")
    public void iAmAnAdminUser() {
    }

    @When("I login to the platform")
    public void iLoginToThePlatform() {
    }

    @And("add a new storefront with the name {string}")
    public void addANewStorefrontWithTheName(String name) {
        this.storeFrontName = name;
    }

    @And("the first line of address as {string}")
    public void theFirstLineOfAddressAs(String line1) {
        this.addressLine1 = line1;
    }

    @And("the second line of address as {string}")
    public void theSecondLineOfAddressAs(String line2) {
        this.addressLine2 = line2;
    }

    @And("the postcode as {string}")
    public void thePostcodeAs(String postcode) {
        this.postCode = postcode;
    }

    @And("the country as {string}")
    public void theCountryAs(String country) {
        this.country = country;
    }

    @Then("the storefront must be added successfully")
    public void theStorefrontMustBeAddedSuccessfully() {
        PickupStore pickupStore = new PickupStore(storeFrontName, addressLine1, addressLine2, postCode, country);
        assertNotNull(pickupStore);
    }

    @And("add a new delivery partner with name as {string}")
    public void addANewDeliveryPartnerWithNameAs(String name) {
        this.deliveryPartnerName = name;
    }

    @And("email as {string}")
    public void emailAs(String email) {
        this.deliveryPartnerEmail = email;
    }

    @And("phone number as {string}")
    public void phoneNumberAs(String phone) {
        this.deliveryPartnerPhone = Long.parseLong(phone);
    }

    @Then("the delivery partner must be registered")
    public void theDeliveryPartnerMustBeRegistered() {
        DeliveryPartner deliveryPartner = new DeliveryPartner(deliveryPartnerName, deliveryPartnerPhone, deliveryPartnerEmail);
        assertNotNull(deliveryPartner);
    }
}
