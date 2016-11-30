/*package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.User;
import com.niit.shoppingcartfrontend.dao.UserDAO;


public class TestUser {
	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static UserDAO userDAO;
	
	@Autowired
	static User user;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		System.out.println("a");
		context.refresh();
		
		userDAO = (UserDAO) context.getBean("userDAO");
		user = (User) context.getBean("user");
		
		System.out.println("objects created");
	}
	
	@Test
	public void saveUserTestCase()
	{
		user.setId("U_11");
		user.setPassword("abcdef123");
		user.setName("anjali"); 
		user.setContact(123456546); 
		user.setEmail("anju@mail.com"); 
		user.setRole("user"); 
		Assert.assertEquals("Create user testcase",true,userDAO.save(user));
	}
	
	@Test
	public void deleteUserTestCase()
	{
	
		user .setId("U_5");
		Boolean status = userDAO.delete(user );
		Assert.assertEquals("delete supplier  testcase",true, status);
	}
	
	@Test
	public void updateUserTestCase()
	{
		user.setId("U_5");
		
		user.setRole("admin");
		
		Boolean status=userDAO.update(user);
		
		Assert.assertEquals("update user testcase",true, status);
	}
	
	@Test
	public void getUserTestCase()
	{
		
		Assert.assertEquals("get user testcase",null, userDAO.get("U_7"));
	}
	
	@Test
	public void getAllUserTestCase()
	{
		
		Assert.assertEquals("get all user testcase",6, userDAO.list().size());
	}
}*/


