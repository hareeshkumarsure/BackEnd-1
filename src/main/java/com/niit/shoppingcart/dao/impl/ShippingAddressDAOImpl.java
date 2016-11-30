package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.d.ShippingAddressDAO;
import com.niit.shoppingcart.model.ShippingAddress;

@Repository("shippingaddressDAO")
public class ShippingAddressDAOImpl implements ShippingAddressDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public ShippingAddressDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public boolean save(ShippingAddress shippingaddress) {
		try
		{
			sessionFactory.getCurrentSession().save(shippingaddress);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean update(ShippingAddress shippingaddress) {
		try
		{
			sessionFactory.openSession().update(shippingaddress);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public boolean delete(ShippingAddress shippingaddress) {
		try
		{
			sessionFactory.getCurrentSession().delete(shippingaddress);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	@Transactional
	public ShippingAddress get(String id) {
		return (ShippingAddress) sessionFactory.openSession().get(ShippingAddress.class, id);
	}
@Transactional
	public List<ShippingAddress> list() {
		String hql="select * from shippingaddress";
		Query q = sessionFactory.openSession().createSQLQuery(hql);
		return q.list();
	}

}
