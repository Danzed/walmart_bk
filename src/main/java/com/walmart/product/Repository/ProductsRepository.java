package com.walmart.product.Repository;

import java.util.List;
import java.util.Optional;

import com.walmart.product.Collection.Products;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Products, String> {

    public Optional<Products> findById(Integer id);

    public List<Products> findByBrandAndDescription(String brand, String description);

    public List<Products> findByBrand(String brand);
}