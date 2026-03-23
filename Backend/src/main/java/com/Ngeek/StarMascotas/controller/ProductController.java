package com.Ngeek.StarMascotas.controller;

import com.Ngeek.StarMascotas.model.Product;
import com.Ngeek.StarMascotas.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService productService;

    // 🔹 GET ALL
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.findAll();
    }

    // 🔹 GET BY ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    // 🔹 CREATE
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.save(product);
    }

    // 🔹 UPDATE
    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable Long id) {
        return productService.update(product, id);
    }

    // 🔹 DELETE
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteById(id);
    }
}
