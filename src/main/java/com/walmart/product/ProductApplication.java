package com.walmart.product;

import com.walmart.product.Repository.ProductsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class ProductApplication implements CommandLineRunner {

	@Autowired
	private ProductsRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("ACA " + productRepository.findByBrand("ooy eqrceli").size());
	}

}
