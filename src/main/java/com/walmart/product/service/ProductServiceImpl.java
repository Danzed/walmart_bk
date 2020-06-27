package com.walmart.product.service;

import java.util.List;

import com.walmart.product.collection.Products;
import com.walmart.product.repository.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

    @Autowired
    ProductsRepository productsRepository;

    @Override
    public List<Products> GetProductsWithLogicPalindrome(String findText) {
        log.info("PRODUCTSERVICE: Init GetProductsWithLogicPalindrome");
        List<Products> productsList = productsRepository.findByIdAndBrandAndDescriptionWithSameText(findText);
        if(findText.equals(new StringBuilder(findText).reverse().toString())) {
            log.info("PRODUCTSERVICE: Init Palindrome");
            productsList.forEach(product -> {
                product.setIsPalindrome(true);
                product.setPricePalindrome((int)Math.round(product.getPrice() / 2));
            });
        }
        return productsList;
    }
    
}