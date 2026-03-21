package com.Ngeek.StarMascotas.service;
import com.Ngeek.StarMascotas.model.Product;

import java.util.List;
import java.util.Optional;

public interface IProductService {

    List<Product> findAll();
    Optional<Product>findById(Long id);
    void deleteById(Long id);
    Product save (Product product);
    Product update (Product product, Long id);

}
