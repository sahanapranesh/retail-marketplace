package org.example.retail.marketplace.catalog.entities;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class Catalog {
    private List<Product> products = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
