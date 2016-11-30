package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.d.CartDAO;
import com.niit.shoppingcart.model.Cart;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public CartDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(Cart cart) {
		try
		{
			sessionFactory.getCurrentSession().save(cart);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean update(Cart cart) {
		try
		{
			sessionFactory.openSession().update(cart);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean delete(Cart cart) {
		try
		{
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public Cart get(String id) {
		return (Cart) sessionFactory.openSession().get(Cart.class, id);
	}
	@Transactional
	public List<Cart> list() {
		String hql="select * from cart";
		Query q = sessionFactory.openSession().createSQLQuery(hql);
		return q.list();
	}

	public List<Cart> list(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
