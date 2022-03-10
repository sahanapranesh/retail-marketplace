package org.example.retail.marketplace.orders.entities;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
public class ShoppingCart {
    private String shoppingCartId;
    private List<Product> products;

    public ShoppingCart() {
        this.shoppingCartId = UUID.randomUUID().toString();
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
