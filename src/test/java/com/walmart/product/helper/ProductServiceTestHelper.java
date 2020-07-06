package com.walmart.product.helper;

import java.util.UUID;

import com.walmart.product.collection.Products;

public class ProductServiceTestHelper {

    public ProductServiceTestHelper() {
    }
    
    /* Default Product Values */
    private static final String ID = UUID.fromString("d8bcc132-c704-4d21-b05f-9557d7fc3d91").toString();
    private static final int id = 1;
    private static final String brand = "oooy";
    private static final String description = "adskfjasldkfj";
    private static final String image = "http://lala.com/imagen";
    private static final int price = 12;
    private static final Boolean isPalindrome = false;
    private static final int pricePalindrome = 0;
    
    public static Products getDefaultProduct() {
        return getAProduct(ID, id, brand, description, image, price, isPalindrome, pricePalindrome);
    }

    public static Products getAProduct(String ID, int id, String brand, String description, String image, int price, Boolean isPalindrome, int pricePalindrome) {
        return new Products(ID, id, brand, description, image, price, isPalindrome, pricePalindrome);
    }
}