package com.walmart.product.service;

import java.util.List;

import com.walmart.product.collection.Products;

public interface IProductService {
    List<Products> GetProductsWithLogicPalindrome(String findText);
}