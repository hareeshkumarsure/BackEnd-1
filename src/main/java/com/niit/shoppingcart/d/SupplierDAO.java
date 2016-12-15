package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.Supplier;

public interface SupplierDAO {
	
public boolean add (Supplier supplier);
public boolean update(Supplier supplier);
public boolean delete(int id);
public Supplier get(int id);
public List<Supplier>list();
public boolean addOrUpdate(Supplier supplier);

}

