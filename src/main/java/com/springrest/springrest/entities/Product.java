package com.springrest.springrest.entities;

public class Product {
	private long id;
	private String title;
	private String description;
	private int price;
	public Product(long id, String title, String description,int price) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
	}
	public Product() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + "]";
	}
	
	
	
}
