/*package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcartfrontend.dao.CartDAO;

public class TestCart {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static CartDAO cartDAO;
	
	@Autowired
	static Cart cart;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		System.out.println("a");
		context.refresh();
		
		cartDAO = (CartDAO) context.getBean("cartDAO");
		cart = (Cart) context.getBean("cart");
		
		System.out.println("objects created");
	}

	@Test
	public void saveCartTestCase()
	{
		cart.setId("C_3"); 
		cart.setPrice(155);
		cart.setQuantity(123);
		cart.setProduct_id("P_4");
		Assert.assertEquals("Create supplier testcase",true,cartDAO.save(cart));
	}

	@Test
	public void deleteCartTestCase()
	{
	
		cart .setId("C_5");
		Boolean status = cartDAO.delete(cart );
		Assert.assertEquals("delete product  testcase",true, status);
	}
	
	@Test
	public void updateCartTestCase()
	{
		cart.setId("C_1");
		
		cart.setQuantity(55);
		
		Boolean status=cartDAO.update(cart);
		
		Assert.assertEquals("update product testcase",true, status);
	}
	@Test
	public void getCartTestCase()
	{
		
		Assert.assertEquals("get cart testcase",null, cartDAO.get("C_1"));
	}
	@Test
	public void getAllCartTestCase()
	{
		
		Assert.assertEquals("get all cart testcase",3, cartDAO.list().size());
	}
}
*/
