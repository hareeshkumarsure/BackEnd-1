  package com.niit.shoppingcart.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
	
	private User user;

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
		public List<User> list() {
			@SuppressWarnings({ "unused", "unchecked" })
			List<User> list = (List<User>) sessionFactory.getCurrentSession().createCriteria(User.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			
			return list();
			
		}
		
		/*@SuppressWarnings("unchecked")
		@Transactional
		public User getUserDetails(User u){
			Session session=sessionFactory.getCurrentSession();
			
			Criteria cr=session.createCriteria(User.class);
			cr.add(Restrictions.eq("mailId",u.getId()));
			cr.add(Restrictions.eq("password",u.getPassword()));
			user=(User)cr.uniqueResult();
			
			return u;
		}*/
		
		
		@Transactional
		public User get(String id) {
			
			Session session=sessionFactory.getCurrentSession();
			
			Criteria ct=session.createCriteria(User.class);
			ct.add(Restrictions.eq("id",id));
			System.out.println(id);
			User u=(User)ct.uniqueResult();
			return u;
		}
		
		public User getUser(){
			return user;
		} 
		
		

        @Transactional
		public User isValidUser(String id, String password) {
        	System.out.println("hi");
            Session session=sessionFactory.getCurrentSession();
			
			Criteria cr=session.createCriteria(User.class);
			cr.add(Restrictions.eq("email",id));
			cr.add(Restrictions.eq("password",password));
			user=(User)cr.uniqueResult();
			System.out.println(user.getName());
			return user;
		}
        
        @Transactional
		public boolean saveOrUpdate(User user) {
			try
			{
			sessionFactory.openSession().saveOrUpdate(user);
			return true;
			}
			catch(HibernateException e)
			{
				e.printStackTrace();
				return false;
			}
			
		}


		

}
