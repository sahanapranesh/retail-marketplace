package org.example.retail.marketplace.catalog;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Category {
    private double categoryId;
    private String name;
    private String description;
}
