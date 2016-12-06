package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.d.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

@Repository("supplierDAO")
public class SupplierDAOImpl implements SupplierDAO {
	
	private static final Supplier Supplier = null;
	
	@Autowired
	SessionFactory sessionFactory;
	
	public SupplierDAOImpl() {
		
	}
	
	public SupplierDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}

	@Transactional
	public boolean add(Supplier supplier) {
		try
		{
			sessionFactory.getCurrentSession().save(supplier);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(Supplier supplier) {
		
		try
		{
			sessionFactory.openSession().update(supplier);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(Supplier supplier) {
		
		try
		{
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Supplier get(String id) {
		
		sessionFactory.getCurrentSession().get(Supplier.class, id);
		return(Supplier);
	}
	
	@Transactional
	public List<Supplier> list() {
		
		/*String hql="select * from supplier";
		Query q = sessionFactory.getCurrentSession().createSQLQuery(hql);
		return q.list();*/
		List<Supplier> list=(List<Supplier>)sessionFactory.getCurrentSession().createCriteria(Supplier.class).list();
		return list;
		
	}

	public boolean addOrUpdate(Supplier supplier) {
		try
		{
		sessionFactory.openSession().saveOrUpdate(supplier);
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

	/*public List<com.niit.shoppingcart.model.Supplier> list() {
		// TODO Auto-generated method stub
		return null;
	}*/

}
