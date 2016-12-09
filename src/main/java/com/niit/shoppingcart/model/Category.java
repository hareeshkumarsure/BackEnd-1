package com.niit.shoppingcart.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;



@Component
@Entity
@Table(name="category")
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private String description;


/*@ManyToOne
 private Product product;
public Product getProduct() {
	return product;
}
public void setProduct(Product product) {
	this.product = product;
}*/
 @OneToMany(mappedBy="category", fetch=FetchType.EAGER)
private Set<Product> products;

public Set<Product> getProducts(){
	return products;
}
public void setProducts(Set<Product> products){
	this.products=products;
}
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
/*public String getCategory_id(String string) {
	// TODO Auto-generated method stub
	return null;
}*/

}
