package org.example.retail.marketplace.catalog;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class Inventory {
    private double inventoryId;
    private Map<Double, Integer> productsMap;

    public Inventory() {
        this.inventoryId = Math.random();
        productsMap = new HashMap<>();
    }

    public void addProduct(Product product, Integer quantity){
        productsMap.put(product.getProductId(), quantity);
    }
}
