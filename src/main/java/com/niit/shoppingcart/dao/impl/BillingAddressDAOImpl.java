package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.model.BillingAddress;

@Repository("billingaddressDAO")
public class BillingAddressDAOImpl implements com.niit.shoppingcart.d.BillingAddressDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public BillingAddressDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean save(BillingAddress billingaddress) {
		try
		{
			sessionFactory.getCurrentSession().save(billingaddress);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(BillingAddress billingaddress) {
		try
		{
			sessionFactory.openSession().update(billingaddress);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(BillingAddress billingaddress) {
		try
		{
			sessionFactory.getCurrentSession().delete(billingaddress);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	public List<BillingAddress> list() {
		String hql="select * from billingaddress";
		Query q = sessionFactory.openSession().createSQLQuery(hql);
		return q.list();
	}

	public BillingAddress get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
