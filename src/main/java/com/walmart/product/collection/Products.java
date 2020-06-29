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

    public Products(String _id, int id, String brand, String description, String image, int price, Boolean isPalindrome,
            int pricePalindrome) {
        this._id = _id;
        this.id = id;
        this.brand = brand;
        this.description = description;
        this.image = image;
        this.price = price;
        this.isPalindrome = isPalindrome;
        this.pricePalindrome = pricePalindrome;
    }

    
}