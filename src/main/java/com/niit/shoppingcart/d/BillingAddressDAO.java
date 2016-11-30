package com.niit.shoppingcart.d;

import java.util.List;

import com.niit.shoppingcart.model.BillingAddress;

public interface BillingAddressDAO {
	public boolean save (BillingAddress billingaddress);
	public boolean update(BillingAddress billingaddress);
	public boolean delete(BillingAddress billingaddress);
	public BillingAddress get(String id);
	public List<BillingAddress>list();
}
