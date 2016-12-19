package com.niit.shoppingcart.d;

import java.util.LinkedHashMap;
import java.util.List;

import com.niit.shoppingcart.model.Cart;

public interface CartDAO {
	public boolean save (Cart cart);
	public boolean update(Cart cart);
	public boolean delete(int id);
	public Cart get(int id);
	public List<Cart>list();
	public List<Cart> get(int productId, int cartId);
	
}
