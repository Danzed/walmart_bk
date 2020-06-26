package com.walmart.product.collection;

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
    private int price;

    //Fields only use in palindrome logic, does not persist in bd
    private Boolean isPalindrome = false;
    private int pricePalindrome = 0;
}