/*package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcartfrontend.dao.SupplierDAO;

public class TestSupplier {
    
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static SupplierDAO supplierDAO;
	
	@Autowired
	static Supplier supplier;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		System.out.println("a");
		context.refresh();
		
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		supplier = (Supplier) context.getBean("supplier");
		
		System.out.println("objects created");
	}
	
	@Test
	public void saveSupplierTestCase()
	{
		supplier.setId("SUP_3");
		supplier.setAddress("hyd");
		supplier.setName("org");    
		
		Assert.assertEquals("Create supplier testcase",true,supplierDAO.save(supplier));
	}
	
	@Test
	public void deleteSupplierTestCase()
	{
	
		supplier .setId("SUP_5");
		Boolean status = supplierDAO.delete(supplier );
		Assert.assertEquals("delete supplier  testcase",true, status);
	}

	@Test
	public void updateSupplierTestCase()
	{
		supplier.setId("SUP_1");
		
		supplier.setName("newsupplier");
		
		Boolean status=supplierDAO.update(supplier);
		
		Assert.assertEquals("update supplier testcase",true, status);
	}
	/*
	@Test
	public void getSupplierTestCase()
	{
		
		Assert.assertEquals("get supplier testcase",null, supplierDAO.get("SUP_4"));
	}
	
	@Test
	public void getAllSupplierTestCase()
	{
		
		Assert.assertEquals("get all supplier testcase",3, supplierDAO.list().size());
	}
}
*/