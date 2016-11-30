package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.ShippingAddress;

public interface ShippingAddressDAO {
	public boolean save (ShippingAddress shippingaddress);
	public boolean update(ShippingAddress shippingaddress);
	public boolean delete(ShippingAddress shippingaddress);
	public ShippingAddress get(String id);
	public List<ShippingAddress>list();
}
