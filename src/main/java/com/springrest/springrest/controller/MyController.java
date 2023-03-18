package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Product;
import com.springrest.springrest.services.ProductService;

@RestController
public class MyController {
	
	@Autowired
	private ProductService productService;

	@GetMapping("/home")
	public String home() {
		return "<h1 style='color:red;text-align:center;'>Welcome to Product API</h1>";
	}
	@GetMapping("/products")
	public List<Product> getProducts(){
		return this.productService.getProducts();
	}
	
	@GetMapping("/products/{productId}")
	public Product getCource(@PathVariable String productId) {
		return this.productService.getProduct(Long.parseLong(productId));
	}
	
	@PostMapping("/products")
	public Product addCourse(@RequestBody Product products) {	
		return this.productService.addProduct(products);
	}
	
	@PutMapping("/products/{productId}")
	public Product updateCourse(@PathVariable String productId,@RequestBody Product product) {
		return this.productService.updateProduct(Long.parseLong(productId), product);
	}
	
	@DeleteMapping("/products/{productId}")
	public String deleteCourse(@PathVariable String productId) {
		return this.productService.deleteProduct(Long.parseLong(productId));
	}
}
