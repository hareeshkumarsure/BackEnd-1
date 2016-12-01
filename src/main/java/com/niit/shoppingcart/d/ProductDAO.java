package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.Product;


public interface ProductDAO {
	public boolean add (Product product);
	public boolean update(Product product);
	public boolean delete(String id);
	public Product get(String id);
	public List<Product>list();
	public boolean addOrUpdate(Product product);

}
