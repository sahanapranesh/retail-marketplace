package org.example.retail.marketplace.catalog;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Product {
    private double productId;
    private String name;
    private String description;
    private double categoryId;
    private BigDecimal cost;

    public Product(String name, double categoryId, BigDecimal cost) {
        this.productId = Math.random();
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
