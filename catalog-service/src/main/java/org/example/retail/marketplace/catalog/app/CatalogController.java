package org.example.retail.marketplace.catalog.app;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.retail.marketplace.catalog.entities.Catalog;
import org.example.retail.marketplace.catalog.entities.Category;
import org.example.retail.marketplace.catalog.entities.Inventory;
import org.example.retail.marketplace.catalog.entities.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class CatalogController {
    private final Catalog catalog;
    private final Inventory inventory;

    @PostMapping("/category/{name}")
    public void addCategory(@PathVariable String name){
        log.info("Received request to add a category with name={}", name);
        catalog.addCategory(new Category(name));
    }

    @GetMapping("/categories")
    public List<Category> getAllCategories(){
        log.info("Received request to fetch all categories");
        return catalog.getCategories();
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody ProductDTO productDTO, @RequestParam Integer quantity){
        log.info("Received request to add a product with name={}", productDTO.getName());
        Product product = new Product(productDTO.getName(), productDTO.getCategoryId(), productDTO.getCost());
        inventory.addProduct(product, quantity);
        catalog.addProduct(product);
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        log.info("Received request to fetch all products");
        return catalog.getProducts();
    }

    @GetMapping("/inventory")
    public Map<String, Integer> getInventory(){
        log.info("Received request to fetch the inventory");
        return inventory.getProductsMap();
    }
}
