package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingcart.d.UserDAO;
import com.niit.shoppingcart.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	private static final User User = null;
	@Autowired
	SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
		}
	
		public UserDAOImpl(){
			
		}
		
		@Transactional
		public boolean save(User user) {
			try
			{
				sessionFactory.getCurrentSession().save(user);
				return true;
			}
			catch(HibernateException e)
			{
				e.printStackTrace();
				return false;
			}
		}
	
		@Transactional
		public boolean update(User user) {
			
			try
			{
				sessionFactory.openSession() .update(user);
				return true;
			}
			catch(HibernateException e)
			{
				e.printStackTrace();
				return false;
			}
		}

		@Transactional
		public boolean delete(User user) {
			
			try
			{
				sessionFactory.getCurrentSession().delete(user);
				return true;
			}
			catch(HibernateException e)
			{
				e.printStackTrace();
				return false;
			}
		}

		@Transactional
		public User get(String id) {
			
		 sessionFactory.openSession().get(User.class, id);
			return (User);
		}

		@Transactional
		public List<User> list() {
			
			String hql="select * from user";
			Query q = sessionFactory.openSession().createSQLQuery(hql);
			return q.list();
			
		}

		public User isValidUser(String id, String password) {
			// TODO Auto-generated method stub
			return null;
		}

		public void saveOrUpdate(User user) {
			// TODO Auto-generated method stub
			
		}


		

}
