/*package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.ShippingAddressDAO;
import com.niit.shoppingcart.model.ShippingAddress;

public class TestShippingAddress {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static ShippingAddressDAO shippingaddressDAO;
	
	@Autowired
	static ShippingAddress shippingaddress;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		System.out.println("a");
		context.refresh();
		
		shippingaddressDAO = (ShippingAddressDAO) context.getBean("shippingaddressDAO");
		shippingaddress = (ShippingAddress) context.getBean("shippingaddress");
		
		System.out.println("objects created");
	}
	@Test
	public void saveShippingAddressTestCase()
	{
		shippingaddress.setId("BA_1");
		shippingaddress.setName("one");  
		shippingaddress.setAddress("hyd");
		shippingaddress.setContact(1056986);
		shippingaddress.setProduct_id("P-4");
		shippingaddress.setBillingAddress_id("P-4");
		Assert.assertEquals("Create billingaddress testcase",true,shippingaddressDAO.save(shippingaddress));
	}
}
*/
