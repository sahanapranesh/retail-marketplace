package org.example.marketplace.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.retail.marketplace.customer.Address;
import org.example.retail.marketplace.customer.Credentials;
import org.example.retail.marketplace.customer.Customer;
import org.example.retail.marketplace.orders.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrdersStepDefs {
    private Customer customer;
    private ShoppingCart shoppingCart;
    private Order order;
    private Transaction transaction;

    @Given("I am an existing customer")
    public void iAmAnExistingCustomer() {
        Credentials credentials = new Credentials("username", "password");
        customer = new Customer(credentials.getCredentialsId());
        customer.addAddress(new Address("line1", "line2", "country", "postcode"));
    }

    @When("I add {int} units of {string} to my shopping cart")
    public void iAddUnitsOfToMyShoppingCart(int quantity, String item) {
        Product product = new Product();
        product.setQuantity(quantity);
        shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(product);
    }

    @And("make the payment")
    public void makeThePayment() {
        transaction = new Transaction(1, order.getOrderId());
    }

    @And("place an order")
    public void placeAnOrder() {
        order = new Order(customer.getCustomerId(), customer.getAddresses().get(0).getAddressId(),
                shoppingCart.getShoppingCartId(), BigDecimal.valueOf(100));
    }

    @Then("the order must be successfully created")
    public void theOrderMustBeSuccessfullyCreated() {
        assertNotNull(order);
    }

    @And("I must be given an estimated delivery date")
    public void iMustBeGivenAnEstimatedDeliveryDate() {
        assertNotNull(order.getEstimatedDeliveryDate());
    }

    @Then("the order status must be {string}")
    public void theOrderStatusMustBe(String status) {
        assertNotNull(order);
        assertEquals(order.getOrderStatus(), OrderStatus.valueOf(status));
    }

    @And("the payment fails")
    public void thePaymentFails() {
        transaction = new Transaction(1, order.getOrderId());
        transaction.updatePaymentStatus(PaymentStatus.PAYMENT_DECLINED);
        //Publish a domain event saying transaction declined - Orders will be updated
        order.updateOrderStatus(OrderStatus.PAYMENT_PENDING);
    }
}
