package com.walmart.product.repository;

import java.util.List;

import com.walmart.product.collection.Products;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ProductsRepository extends MongoRepository<Products, String> {
    @Query(value = "{ $or: [ {$where: '/^?0.*/.test(this.id)'}, {'brand': {$regex : '.*?0.*', $options: 'i'}}, {'description': {$regex : '.*?0.*', $options: 'i'}} ]}")
    public List<Products> findByIdAndBrandAndDescriptionWithSameText(String find);
}