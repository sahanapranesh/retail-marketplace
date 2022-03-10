package org.example.marketplace.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.retail.marketplace.entities.customer.Address;
import org.example.retail.marketplace.entities.customer.Credentials;
import org.example.retail.marketplace.entities.customer.Customer;
import org.example.retail.marketplace.entities.customer.PaymentMode;

import java.math.BigDecimal;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class CustomerStepDefs {

    private Customer customer;
    private Address address;
    private Credentials credentials;
    private String country;
    private String postCode;

    @Before
    public void setUp() throws Exception {
    }

    @Given("I am a new customer")
    public void iAmANewCustomer() {
    }

    @When("I enter my firstname as {string} and lastname as {string}")
    public void iEnterMyFirstnameAsAndLastnameAs(String firstname, String lastname) {
        customer.setFirstName(firstname);
        customer.setLastName(lastname);
    }

    @And("I enter my payments mode as {string} and number as {int}")
    public void iEnterMyPaymentsModeAsAndNumberAs(String type, int number) {
        PaymentMode paymentMode = new PaymentMode();
        paymentMode.setType(type);
        paymentMode.setAccountNumber(BigDecimal.valueOf(number));
        customer.addPaymentMode(paymentMode);
    }

    @And("I enter my country as {string} and postcode as {string}")
    public void iEnterMyCountryAsAndPostcodeAs(String country, String postcode) {
        this.country = country;
        this.postCode = postcode;
    }

    @And("I enter my first line of address as {string} and second line as {string}")
    public void iEnterMyFirstLineOfAddressAsAndSecondLineAs(String line1, String line2) {
        address = new Address(line1, line2, country, postCode);
        customer.addAddress(address);
    }

    @Then("I must be allowed to use the platform")
    public void i_must_be_allowed_to_use_the_platform() {
        assertNotNull(customer);
        assertFalse(customer.getAddresses().isEmpty());
        assertFalse(customer.getPaymentModes().isEmpty());
    }

    @When("I enter my username as {string} and password as {string}")
    public void iEnterMyUsernameAsAndPasswordAs(String username, String password) {
        credentials = new Credentials(username,password);
        customer = new Customer(credentials.getCredentialsId());
    }
}
