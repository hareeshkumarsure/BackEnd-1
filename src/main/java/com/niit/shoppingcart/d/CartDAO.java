package com.niit.shoppingcart.d;

import java.util.LinkedHashMap;
import java.util.List;

import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.User;

public interface CartDAO {
	public boolean save (Cart cart);
	public boolean update(Cart cart);
	public boolean delete(int id);
	public Cart get(int id);
	public List<Cart>list();
	public Cart getCart(String userId);
	
	public boolean isInCart(String id, String product);
	
}
