package com.niit.shoppingkart.daoimp;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingkart.dao.ShippingaddressDAO;
import com.niit.shoppingkartback.domain.Shippingaddress;

@Repository("ShippingaddressDAO")
public class ShippingaddressDAOImpl implements ShippingaddressDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	public ShippingaddressDAOImpl (SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Shippingaddress> list(String email) {
		return sessionFactory.getCurrentSession().createQuery("from Shippingaddress").list();

	}

	public void saveOrUpdate(Shippingaddress address) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(address);

	}




	public void delete(String sid) {
		Shippingaddress shippingaddressToDelete = new Shippingaddress();
		shippingaddressToDelete.setSid(sid);
		sessionFactory.getCurrentSession().delete(shippingaddressToDelete);

	}

	public List<Shippingaddress> list() {
		@SuppressWarnings({ "unchecked" })
		List<Shippingaddress> listShippingaddress = (List<Shippingaddress>) sessionFactory.getCurrentSession().createCriteria(Shippingaddress.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listShippingaddress;
	}

	public Shippingaddress getByShippingAddress(String address) {
		String hql = "from Shippingaddress where ShippingAddress ='" + address + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Shippingaddress> listShippingaddress = (List<Shippingaddress>) (query).list();

		if (listShippingaddress != null && !listShippingaddress.isEmpty()) {
			return listShippingaddress.get(0);
		}
		return null;
	}

	public Shippingaddress getByUserName(String username) {
		String hql = "from Shippingaddress where UserName='" + username + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Shippingaddress> listShippingaddress = (List<Shippingaddress>) (query).list();

		if (listShippingaddress != null && !listShippingaddress.isEmpty()) {
			return listShippingaddress.get(0);
		}
		return null;
	}

	public Shippingaddress getBySid(String sid) {
		String hql = "from Shippingaddress where ShippingId='" + sid + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Shippingaddress> listShippingaddress = (List<Shippingaddress>) (query).list();

		if (listShippingaddress != null && !listShippingaddress.isEmpty()) {
			return listShippingaddress.get(0);
		}
		return null;
	}

	
}
