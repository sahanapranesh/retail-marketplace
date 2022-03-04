package org.example.retail.marketplace.catalog;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Catalog {
    private List<Product> products;

    public void addProduct(Product product){
        if(products == null){
            products = new ArrayList<>();
        }
        products.add(product);
    }
}
