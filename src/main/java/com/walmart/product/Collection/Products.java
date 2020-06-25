package com.walmart.product.Collection;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Products {
    @Id
    private String _id;
    private int id;
    private String brand;
    private String description;
    private String image;
    private Double price;

    
}