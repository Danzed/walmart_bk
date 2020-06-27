package com.walmart.product.controller;

import java.util.List;

import com.walmart.product.collection.Products;
import com.walmart.product.service.IProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/product")
public class ProductController {

    @Autowired
    IProductService productService;

    @GetMapping("/{findText}")
    public List<Products> Get(@PathVariable("findText") String findText) {
        return productService.GetProductsWithLogicPalindrome(findText);
    }
}