package com.Ngeek.StarMascotas.repository;

import com.Ngeek.StarMascotas.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {
}
