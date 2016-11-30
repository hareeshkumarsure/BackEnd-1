/*package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.BillingAddressDAO;
import com.niit.shoppingcart.model.BillingAddress;

public class TestBillingAddress {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static BillingAddressDAO billingaddressDAO;
	
	@Autowired
	static BillingAddress billingaddress;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		System.out.println("a");
		context.refresh();
		
		billingaddressDAO = (BillingAddressDAO) context.getBean("billingaddressDAO");
		billingaddress = (BillingAddress) context.getBean("billingaddress");
		
		System.out.println("objects created");
	}
	@Test
	public void saveBillingAddressTestCase()
	{
		billingaddress.setId("BA_1");
		billingaddress.setName("one");  
		billingaddress.setAddress("hyd");
		billingaddress.setContact(1056986);
		billingaddress.setAmount(320);
		Assert.assertEquals("Create billingaddress testcase",true,billingaddressDAO.save(billingaddress));
	}
}
*/
