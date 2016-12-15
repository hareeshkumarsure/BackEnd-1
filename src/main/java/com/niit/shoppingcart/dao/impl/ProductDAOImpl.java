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

import com.niit.shoppingcart.d.ProductDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Repository("productDAO")

public class ProductDAOImpl implements ProductDAO {
	private static final Object Id = null;
	@Autowired
	SessionFactory sessionFactory;
	
	public ProductDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean add(Product product) {
		
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

	/*@Transactional
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
	}*/

	@Transactional
	public Product get(int id) {
		Product prod=(Product)sessionFactory.getCurrentSession().get(Product.class, id);
		return prod;
	}

	@Transactional
	public List<Product> list() {
		
		/*String hql="select * from product";
		Query q = sessionFactory.openSession().createSQLQuery(hql);
		return q.list();*/
		List<Product> list=(List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).list();
		return list;
	}
	
	@Transactional
	public List<Product> productByCategory(int id)
	{
		List<Product> productByCategory=(List<Product>)sessionFactory.getCurrentSession().createCriteria(Product.class).add(Restrictions.eq("Id", id));
		return productByCategory;
				}

	public boolean addOrUpdate(Product product) {
		try
		{
		sessionFactory.openSession().saveOrUpdate(product);
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
			Criteria cr =session.createCriteria(Product.class);
			cr.add(Restrictions.eq("id",id));
			Product product=(Product)cr.uniqueResult();
			session.delete(product);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
