package org.example.retail.marketplace.catalog.entities;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Getter
@Component
public class Inventory {
    private String inventoryId;
    private Map<String, Integer> productsMap;

    public Inventory() {
        this.inventoryId = UUID.randomUUID().toString();
        productsMap = new HashMap<>();
    }

    public void addProduct(Product product, Integer quantity) {
        productsMap.put(product.getProductId(), quantity);
    }
}
