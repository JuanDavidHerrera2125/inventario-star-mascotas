package com.Ngeek.StarMascotas.model;



import com.Ngeek.StarMascotas.enums.Category;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table (name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    private Integer stock;
    @Enumerated(EnumType.STRING)
    private Category category;
}
