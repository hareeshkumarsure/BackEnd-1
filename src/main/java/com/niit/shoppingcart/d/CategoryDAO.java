package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.Category;

public interface CategoryDAO {
public boolean add (Category category);
public boolean update (Category category);
public boolean delete (int id);
public Category get(int id);
public List<Category>list();
public boolean addOrUpdate(Category category);

}
