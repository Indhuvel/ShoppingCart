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
	public User getById(String email) {
		User user = (User) sessionFactory.getCurrentSession().get(User.class, email);
		 
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
	public User getByMailId(String email) {
		String hql = "from User where email ='" + email + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) (query).list();

		if (listUser != null && !listUser.isEmpty()) {
			return listUser.get(0);
		
		}
		return null;
		}
	public void delete(String id) {
		User userToDelete = new User();
		userToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
		
	}
	public boolean isAllReadyRegister(String email, boolean b) {
		String hql = "from User where email ='"+ email +"'";
		
		
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<User> list = (List<User>) query.list();
		if (list != null && !list.isEmpty()) {
			return true;
		}
		return false;

	}
	
	}

