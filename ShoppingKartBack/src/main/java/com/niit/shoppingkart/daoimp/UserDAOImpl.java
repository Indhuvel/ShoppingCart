package com.niit.shoppingkart.daoimp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.User;

@Transactional
@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public User get(String id) {
		User user = (User) sessionFactory.getCurrentSession().get(User.class, id);
		 
		 return user;
	}
	@SuppressWarnings("unchecked")
	public List<User> list() {
		return sessionFactory.getCurrentSession().createQuery("from User").list();
		
	}

	
	public void saveOrUpdate(User user) {
		
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			
		}
	
	public boolean isValidCredentials(String email, String password) {
		String hql = "from User where email= '" + email + "' and " + " password ='" + password+"'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) query.list();
		if (list != null && !list.isEmpty()) {
			return true;
		}
		return false;
	}

	}

