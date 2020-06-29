package com.walmart.product.collection;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
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