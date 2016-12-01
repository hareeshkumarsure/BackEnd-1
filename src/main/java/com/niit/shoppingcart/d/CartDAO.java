package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.Cart;

public interface CartDAO {
	public boolean save (Cart cart);
	public boolean update(Cart cart);
	public boolean delete(Cart cart);
	public Cart get(String id);
	public List<Cart>list();
	public List<Cart> list(String id);
	public Object getTotalAmount(String loggedInUserId);
	public void delete(String id);
}
