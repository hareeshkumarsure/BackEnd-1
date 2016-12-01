package com.niit.shoppingcart.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name="cart")
public class Cart {
	@Id
	private long id;
	@ManyToOne
	private Product product;
	private double price;
	private double quantity;
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public void setProduct_id(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setProductName(String name) {
		// TODO Auto-generated method stub
		
	}
	public void setUserId(String loggedInUserId) {
		// TODO Auto-generated method stub
		
	}
	public void setStatus(String string) {
		// TODO Auto-generated method stub
		
	}
		
	}
	
