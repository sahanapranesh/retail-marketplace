package org.example.retail.marketplace.catalog.entities;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class Product {
    private String productId;
    private String name;
    private String description;
    private String categoryId;
    private BigDecimal cost;

    public Product(String name, String categoryId, BigDecimal cost) {
        this.productId = UUID.randomUUID().toString();
        this.name = name;
        this.categoryId = categoryId;
        this.cost = cost;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void updateCost(BigDecimal cost) {
        this.cost = cost;
    }
}
