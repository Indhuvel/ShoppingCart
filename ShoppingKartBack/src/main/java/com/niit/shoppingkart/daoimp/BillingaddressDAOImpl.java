package com.niit.shoppingkart.daoimp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingkart.dao.BillingaddressDAO;
import com.niit.shoppingkartback.domain.Billingaddress;

@Transactional
@Repository("BillingaddressDAO")
public class BillingaddressDAOImpl implements BillingaddressDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public BillingaddressDAOImpl (SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Billingaddress> list(String id) {
		return sessionFactory.getCurrentSession().createQuery("from Billingaddress").list();

	}

	public Billingaddress get(String Bid) {
		Billingaddress billingaddress = (Billingaddress) sessionFactory.getCurrentSession().get(Billingaddress.class,Bid);

		return billingaddress;
	}

	public void saveOrUpdate(Billingaddress billingaddress) {
		sessionFactory.getCurrentSession().save(billingaddress);
		
	}

	public void delete(String bid) {
		Billingaddress billingaddressToDelete = new Billingaddress();
		billingaddressToDelete.setBid(bid);
		sessionFactory.getCurrentSession().delete(billingaddressToDelete);
		
	}
}
