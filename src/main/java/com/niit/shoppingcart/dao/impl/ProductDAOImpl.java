package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.d.ProductDAO;
import com.niit.shoppingcart.model.Product;

@Repository("productDAO")

public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Product product) {
		
		try
		{
			sessionFactory.getCurrentSession().save(product);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}

	}

	@Transactional
	public boolean update(Product product) {
		
		try
		{
			sessionFactory.openSession().update(product);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(Product product) {
		
		try
		{
			sessionFactory.getCurrentSession().delete(product);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Product get(String id) {
		
		return (Product) sessionFactory.openSession().get(Product.class, id);
	}

	@Transactional
	public List<Product> list() {
		
		String hql="select * from product";
		Query q = sessionFactory.openSession().createSQLQuery(hql);
		return q.list();
	}

}
