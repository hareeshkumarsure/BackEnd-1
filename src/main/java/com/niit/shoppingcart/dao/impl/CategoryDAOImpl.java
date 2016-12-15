package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
			sessionFactory.getCurrentSession().update(category);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
/*
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
	*/
@Transactional
	public Category get(int id) {
		Category cat=(Category)sessionFactory.getCurrentSession().get(Category.class, id);
		return cat;
	}


@Transactional
	public List<Category> list() {
	/*String hql="select * from category";
		Query q = sessionFactory.getCurrentSession().createSQLQuery(hql);
		return q.list();*/
		List<Category> list=(List<Category>)sessionFactory.getCurrentSession().createCriteria(Category.class).list();
		return list;
	}


@Transactional
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

@Transactional
public boolean delete(int id) {
	System.out.println("delete method");
	try
	{
		Session session = sessionFactory.getCurrentSession();
		Criteria cr =session.createCriteria(Category.class);
		cr.add(Restrictions.eq("id",id));
		Category category=(Category)cr.uniqueResult();
		session.delete(category);
		return true;
	}
	catch(HibernateException e)
	{
		e.printStackTrace();
		return false;
	}
}


}


