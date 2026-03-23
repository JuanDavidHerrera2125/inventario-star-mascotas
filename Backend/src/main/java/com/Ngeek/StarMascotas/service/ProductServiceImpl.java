package com.Ngeek.StarMascotas.service;

import com.Ngeek.StarMascotas.model.Product;
import com.Ngeek.StarMascotas.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);

    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product, Long id) {
        return productRepository.findById(id)
                .map(productExist ->{
                    productExist.setName(product.getName());
                    productExist.setPrice(product.getPrice());
                    productExist.setStock(product.getStock());
                    productExist.setCategory(product.getCategory());
                    return productRepository.save(productExist);
                }
        ).orElseThrow(() -> new RuntimeException("Product Not Found"));

        }

}
