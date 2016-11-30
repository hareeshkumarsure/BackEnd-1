package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="product")
public class Product {
	@Id
	private String id;
	private String name;
	private double price;
	private double stock;
	@ManyToOne
	private Supplier supplier;
	@ManyToOne
	private Category category;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(int i) {
		this.stock = stock;
	}

	public Supplier getSupplier_id() {
		return getSupplier_id();
	}

	public void setSupplier_id(String string) {
		this.supplier = supplier;
	}

	public Category getCategory_id() {
		return getCategory_id();
	}

	public void setCategory_id(String string) {
		this.category = category;
	}

	

}
