package org.example.retail.marketplace.orders;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ShoppingCart {
    private double shoppingCartId;
    private List<Product> products;

    public ShoppingCart() {
        this.shoppingCartId = Math.random();
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }
}
