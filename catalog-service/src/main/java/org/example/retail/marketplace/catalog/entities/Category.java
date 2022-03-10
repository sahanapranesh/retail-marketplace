package org.example.retail.marketplace.catalog.entities;

import lombok.Getter;

import java.util.UUID;

@Getter
public class Category {
    private String categoryId;
    private String name;
    private String description;

    public Category(String name) {
        this.categoryId = UUID.randomUUID().toString();
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
