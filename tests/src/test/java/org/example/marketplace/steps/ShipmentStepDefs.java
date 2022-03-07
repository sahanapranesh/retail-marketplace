package org.example.marketplace.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.retail.marketplace.customer.Address;
import org.example.retail.marketplace.customer.Credentials;
import org.example.retail.marketplace.customer.Customer;
import org.example.retail.marketplace.delivery.Delivery;
import org.example.retail.marketplace.delivery.DeliveryStatus;
import org.example.retail.marketplace.delivery.types.DeliveryType;
import org.example.retail.marketplace.delivery.types.ElectronicDelivery;
import org.example.retail.marketplace.delivery.types.PreferredLocationDelivery;
import org.example.retail.marketplace.delivery.types.StorefrontDelivery;
import org.example.retail.marketplace.orders.Order;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class ShipmentStepDefs {
    private Customer customer;
    private Order order;
    private DeliveryType deliveryType;
    private Delivery delivery;

    @Given("I am a customer")
    public void iAmACustomer() {
        Credentials credentials = new Credentials("username", "password");
        customer = new Customer(credentials.getCredentialsId());
        customer.addAddress(new Address("line1", "line2", "country", "postcode"));
    }

    @When("I place an order")
    public void iPlaceAnOrder() {
        order = new Order(customer.getCustomerId(), 1, BigDecimal.valueOf(45));
    }

    @And("I select the {string} storefront to pick up my order")
    public void iSelectTheStorefrontToPickUpMyOrder(String storefrontName) {
        deliveryType = new StorefrontDelivery(1);
        delivery = new Delivery(order.getOrderId(), deliveryType.getDeliveryTypeId());
    }

    @Then("I should be able to receive the order at the store")
    public void iShouldBeAbleToReceiveTheOrderAtTheStore() {
        assertions();
    }

    private void assertions() {
        assertEquals(0, Double.compare(delivery.getOrderId(), order.getOrderId()));
        assertEquals(0, Double.compare(delivery.getDeliveryTypeId(), deliveryType.getDeliveryTypeId()));
        assertEquals(DeliveryStatus.SCHEDULED, delivery.getStatus());
    }

    @And("select my {string} address for delivery")
    public void selectMyAddressForDelivery(String address) {
        deliveryType = new PreferredLocationDelivery(1);
        delivery = new Delivery(order.getOrderId(), deliveryType.getDeliveryTypeId());
    }

    @Then("the order should be delivered at my preferred address")
    public void theOrderShouldBeDeliveredAtMyPreferredAddress() {
        assertions();
    }

    @And("choose to receive the order over my email address")
    public void chooseToReceiveTheOrderOverMyEmailAddress() {
        deliveryType = new ElectronicDelivery("sahakl.24@jjjjj.com");
        delivery = new Delivery(order.getOrderId(), deliveryType.getDeliveryTypeId());
    }

    @Then("the order should be delivered successfully")
    public void theOrderShouldBeDeliveredSuccessfully() {
        assertions();
    }
}
