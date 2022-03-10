package org.example.retail.marketplace.catalog.app;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductDTO {
    private String name;
    private String description;
    private String categoryId;
    private BigDecimal cost;


}
