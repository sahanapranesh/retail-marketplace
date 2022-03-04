package org.example.retail.marketplace.catalog;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Getter
public class Product {
    private double productId;
    private String name;
    private String description;
    private double categoryId;
    private double sellerId;
    private BigDecimal cost;
    private double inventoryId;
}
