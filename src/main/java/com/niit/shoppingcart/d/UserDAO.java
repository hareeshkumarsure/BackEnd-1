 package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.User;

public interface UserDAO {
	public boolean save  (User user);
	public boolean update (User user);
	public boolean delete (User user);
	public User get(String id);
	public List<User>list();
	public User isValidUser(String id, String password);
	public void saveOrUpdate(User user);

}
