package com.niit.shoppingkart.daoimp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingkart.dao.ShippingaddressDAO;
import com.niit.shoppingkartback.domain.Shippingaddress;

@Transactional
@Repository("ShippingaddressDAO")
public class ShippingaddressDAOImpl implements ShippingaddressDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public ShippingaddressDAOImpl (SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}




	@SuppressWarnings("unchecked")
	public List<Shippingaddress> list(String id) {
		return sessionFactory.getCurrentSession().createQuery("from Shippingaddress").list();

	}


public Shippingaddress get(String uname) {
	Shippingaddress shippingaddress = (Shippingaddress) sessionFactory.getCurrentSession().get(Shippingaddress.class, uname);

	return shippingaddress;
	}




	public void saveOrUpdate(Shippingaddress shippingaddress) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(shippingaddress);

	}




	public void delete(String sid) {
		Shippingaddress shippingaddressToDelete = new Shippingaddress();
		shippingaddressToDelete.setSid(sid);
		sessionFactory.getCurrentSession().delete(shippingaddressToDelete);

	}	
}
