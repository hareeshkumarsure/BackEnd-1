package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;


public interface ProductDAO {
	public boolean add (Product product);
	public boolean update(Product product);
	public boolean delete(int id);
	public Product get(int id);
	public List<Product>list();
	public List<Product>productByCategory(int id);
	public boolean addOrUpdate(Product product);

}
