package org.example.marketplace.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.retail.marketplace.entities.customer.Address;
import org.example.retail.marketplace.entities.customer.Credentials;
import org.example.retail.marketplace.entities.customer.Customer;
import org.example.retail.marketplace.orders.entities.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class OrdersStepDefs {
    private Customer customer;
    private ShoppingCart shoppingCart;
    private OrderAggregate orderAggregate;
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
        transaction = new Transaction("1", orderAggregate.getOrderId());
    }

    @And("place an order")
    public void placeAnOrder() {
        orderAggregate = new OrderAggregate(customer.getCustomerId(),
                shoppingCart.getShoppingCartId(), BigDecimal.valueOf(100));
    }

    @Then("the order must be successfully created")
    public void theOrderMustBeSuccessfullyCreated() {
        assertNotNull(orderAggregate);
    }

    @And("I must be given an estimated delivery date")
    public void iMustBeGivenAnEstimatedDeliveryDate() {
        assertNotNull(orderAggregate.getEstimatedDeliveryDate());
    }

    @Then("the order status must be {string}")
    public void theOrderStatusMustBe(String status) {
        assertNotNull(orderAggregate);
        assertEquals(orderAggregate.getOrderStatus(), OrderStatus.valueOf(status));
    }

    @And("the payment fails")
    public void thePaymentFails() {
        transaction = new Transaction("1", orderAggregate.getOrderId());
        transaction.updatePaymentStatus(PaymentStatus.PAYMENT_DECLINED);
        //Publish a domain event saying transaction declined - Orders will be updated
        orderAggregate.updateOrderStatus(OrderStatus.PAYMENT_PENDING);
    }

    @And("I remove {int} units of {string} from my shopping cart")
    public void iRemoveUnitsOfFromMyShoppingCart(int arg0, String arg1) {
        int existingQuantity = shoppingCart.getProducts().get(0).getQuantity();
        int finalQuantity = existingQuantity - arg0;
        shoppingCart.getProducts().get(0).setQuantity(finalQuantity);
    }

    @And("the quantity of items ordered should be {int}")
    public void theQuantityOfItemsOrderedShouldBe(int finalQuantity) {
        assertEquals(shoppingCart.getProducts().get(0).getQuantity(), finalQuantity);
    }

    @And("I cancel the order")
    public void iCancelTheOrder() {
        orderAggregate.updateOrderStatus(OrderStatus.CANCELLED);
        //Publish a domain event saying order cancelled - initiate refund
        transaction.updatePaymentStatus(PaymentStatus.REFUND_PROCESSED);
    }

    @And("I should receive a refund of the order amount")
    public void iShouldReceiveARefundOfTheOrderAmount() {

    }
}
