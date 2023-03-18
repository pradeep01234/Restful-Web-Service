package com.springrest.springrest.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Product;

@Service
public class ProductServiceimpl implements ProductService {
	List<Product> list;
	
	
	public ProductServiceimpl() {
		list=new ArrayList<>();
		list.add(new Product(1,"samsung","m11",15000));
		list.add(new Product(2,"realme","a17",19000));
		
	}
	
	
	

	public List<Product> getProducts() {
		
		return list;
	}

	public Product getProduct(long courseId) {
		Product c=null;
		for(Product course:list) {
			if(course.getId()==courseId) {
				c=course;
				break;
			}
		}
		return c;
	}

	
	public Product addProduct(Product course) {
		list.add(course);
		return course;
	}

	
	public Product updateProduct(long courseId, Product course) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==courseId) {
				list.set(i, course);
				return course;
			}
		}
		return null;
	}


	public String deleteProduct(long courseId) {
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getId()==courseId) {
				list.remove(i);
				return "deleted";
			}
		}
		return "not found";
	}

}
