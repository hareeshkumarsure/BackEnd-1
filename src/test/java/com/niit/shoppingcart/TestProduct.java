/*package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcartfrontend.dao.ProductDAO;


public class TestProduct {
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static ProductDAO productDAO;
	
	@Autowired
	static Product product;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		System.out.println("a");
		context.refresh();
		
		productDAO = (ProductDAO) context.getBean("productDAO");
		product = (Product) context.getBean("product");
		
		System.out.println("objects created");
	}
	
	@Test
	public void saveProductTestCase()
	{
		product.setId("P_8");
		product.setName("eight");  
		product.setStock(115);
		product.setPrice(122);
		Category c=new Category();
	//	product.setCategory_id(c.getCategory_id("MOB_29"));
		product.setSupplier_id("SUP_1");
		Assert.assertEquals("Create supplier testcase",true,productDAO.save(product));
	}

	@Test
	public void deleteProductTestCase()
	{
	
		product .setId("P_3");
		Boolean status = productDAO.delete(product );
		Assert.assertEquals("delete product  testcase",true, status);
	}
	
	
	@Test
	public void updateProductTestCase()
	{
		product.setId("P_4");
		
		product.setName("newproduct");
		
		Boolean status=productDAO.update(product);
		
		Assert.assertEquals("update product testcase",true, status);
	}
	
	@Test
	public void getProductTestCase()
	{
		
		Assert.assertEquals("get product testcase",null, productDAO.get("P_4"));
	}
	
	@Test
	public void getAllProductTestCase()
	{
		
		Assert.assertEquals("get all product testcase",2, productDAO.list().size());
	}
}
*/