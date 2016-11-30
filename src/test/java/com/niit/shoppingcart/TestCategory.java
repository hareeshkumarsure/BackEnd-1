/*package com.niit.shoppingcart;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcartfrontend.dao.CategoryDAO;

public class TestCategory {

	@Autowired
	static
	AnnotationConfigApplicationContext context;
	
	@Autowired 
	static Category category;
	
	@Autowired 
	static CategoryDAO categoryDAO;
	
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		
		context.scan("com.niit.shoppingcart");
		System.out.println("a");
		context.refresh();
		System.out.println("b");
		categoryDAO= (CategoryDAO) context.getBean("categoryDAO");
		System.out.println("c");
       category = (Category) context.getBean("category");
		
		System.out.println("objects created");

System.out.println("Version - "+org.hibernate.Version.getVersionString());
	}
	
	@Test
	public void createCategoryTestCase()
	{
		category.setId("MOB_31");
		category.setDescription(" Mobile31");
		category.setName("MC31");    
		
		Boolean status=categoryDAO.save(category);
		
		Assert.assertEquals("Create category testcase",true, status);
	}

	@Test
	public void deleteCategoryTestCase()
	{
		category = (Category) context.getBean("category");
		category.setId("MOB 21");
		Boolean status = categoryDAO.delete(category);
		Assert.assertEquals("delete category testcase",true, status);
	}
	
	@Test
	public void updateCategoryTestCase()
	{
		category.setId("MOB_28");
		
		category.setDescription("MCat");
		
		Boolean status=categoryDAO.update(category);
		
		Assert.assertEquals("update category testcase",true, status);
	}
	
	@Test
	public void getCategoryTestCase()
	{
		
		Assert.assertEquals("get category testcase",null, categoryDAO.get("MOB 07"));
	}
	
	@Test
	public void getAllCategoryTestCase()
	{
		
		Assert.assertEquals("get all category testcase",10, categoryDAO.list(null).size());
	}
	
}
*/
	

	

