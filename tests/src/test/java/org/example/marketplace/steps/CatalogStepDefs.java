package org.example.marketplace.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.retail.marketplace.catalog.entities.Catalog;
import org.example.retail.marketplace.catalog.entities.Category;
import org.example.retail.marketplace.catalog.entities.Inventory;
import org.example.retail.marketplace.catalog.entities.Product;


import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CatalogStepDefs {
    private Category category;
    private Inventory inventory;
    private Product product;
    private Catalog catalog;

    @Before
    public void setUp() throws Exception {
        catalog = new Catalog();
    }

    @Given("As an admin user")
    public void asAnAdminUser() {
    }

    @Then("the product must be added")
    public void theProductMustBeAdded() {
        assertEquals(1, catalog.getProducts().size());
        assertEquals(1, inventory.getProductsMap().size());
        assertEquals("Cookies", catalog.getProducts().get(0).getName());
    }

    @Then("the category must be added")
    public void theCategoryMustBeAdded() {
        assertNotNull(category);
    }

    @When("I add a {string}")
    public void iAddACategory(String categoryName) {
        category = new Category(categoryName);
    }

    @When("I add {int} quantities of {string} costing {string} to the {string}")
    public void iAddQuantityQuantitiesOfProductCostingCostToTheCategory(Integer quantity,String productName, String cost, String categoryName ) {
        inventory = new Inventory();
        category = new Category(categoryName);
        product = new Product(productName, category.getCategoryId(), new BigDecimal(cost));
        catalog.addProduct(product);
        inventory.addProduct(product, quantity);
    }
}
