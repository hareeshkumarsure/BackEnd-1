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

import com.niit.shoppingcart.d.CartDAO;
import com.niit.shoppingcart.model.Cart;
import com.niit.shoppingcart.model.Product;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {

	@Autowired
	SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(Cart cart) {
		try {
			sessionFactory.getCurrentSession().save(cart);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean update(Cart cart) {
		try {
			sessionFactory.openSession().update(cart);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public boolean delete(int id) {
		System.out.println("delete method");
		try {
			Session session = sessionFactory.getCurrentSession();
			Criteria cr = session.createCriteria(Cart.class);
			cr.add(Restrictions.eq("id", id));
			Cart cart = (Cart) cr.uniqueResult();
			session.delete(cart);
			return true;
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Transactional
	public Cart get(int id) {
		Cart cart = (Cart) sessionFactory.getCurrentSession().get(Cart.class, id);
		return cart;
	}

	@Transactional
	public List<Cart> list() {
		List<Cart> list = (List<Cart>) sessionFactory.getCurrentSession().createCriteria(Cart.class).list();
		return list;
	}

	public List<Cart> get(int productId, int cartId) {
		Session session=sessionFactory.getCurrentSession();
		Criteria cr=session.createCriteria(Cart.class).add(Restrictions.eq("cartGroupId.productId.productId",productId));
		cr.add(Restrictions.eq("cartGroupId.cartId.cartId",cartId));
		List<Cart> cartItems=cr.list();
		return cartItems;
	}

}