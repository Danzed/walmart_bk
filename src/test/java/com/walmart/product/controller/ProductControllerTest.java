package com.walmart.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(ProductController.class)
public class ProductControllerTest {
 
    @Autowired
    private MockMvc mvc;
    // write test cases here
}