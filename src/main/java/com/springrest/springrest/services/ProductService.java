package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Product;

public interface ProductService {

	public List<Product> getProducts();
	public Product getProduct(long courseId);
	public Product addProduct(Product course);
	public Product updateProduct(long courseId,Product course);
	public String deleteProduct(long courseId);
}
