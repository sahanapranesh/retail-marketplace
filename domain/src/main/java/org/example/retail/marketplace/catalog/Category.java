package org.example.retail.marketplace.catalog;

import lombok.Getter;

@Getter
public class Category {
    private double categoryId;
    private String name;
    private String description;

    public Category(String name) {
        this.categoryId = Math.random();
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
