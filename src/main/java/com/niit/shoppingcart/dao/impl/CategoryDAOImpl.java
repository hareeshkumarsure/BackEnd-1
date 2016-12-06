package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.d.CategoryDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {
private static final Category Category = null;

@Autowired
private SessionFactory sessionFactory;

public CategoryDAOImpl() {
	
}

public CategoryDAOImpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
	}


@Transactional
	public boolean add(Category category) {
		try
		{
			if(get(category.getId())!=null)
             {
 	             return false;
             }
			sessionFactory.getCurrentSession().save(category);
			return true;
		}
		catch(HibernateException e)
		{
		 	e.printStackTrace();
			return false;
		}
	}

@Transactional
	public boolean update(Category category) {
		try
		{
			sessionFactory.openSession().update(category);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	public boolean delete(Category category) {
		try
		{
			sessionFactory.getCurrentSession().delete(category);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
@Transactional
	public Category get(String id) {
		sessionFactory.getCurrentSession().get(Category.class, id);
		return(Category);
	}
@Transactional
	public List<Category> list() {
	/*String hql="select * from category";
		Query q = sessionFactory.getCurrentSession().createSQLQuery(hql);
		return q.list();*/
		List<Category> list=(List<Category>)sessionFactory.getCurrentSession().createCriteria(Category.class).list();
		return list;
	}



public boolean addOrUpdate(Category category) {
	try
	{
	sessionFactory.openSession().saveOrUpdate(category);
	return true;
	}
	catch(HibernateException e)
	{
		e.printStackTrace();
		return false;
	}
	
}


public boolean delete(String id) {
	// TODO Auto-generated method stub
	return false;
}


}


