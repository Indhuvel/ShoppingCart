package com.niit.shoppingkart.daoimp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingkart.dao.MykartDAO;
import com.niit.shoppingkartback.domain.Mykart;

@Repository("mykartDAO")
@Transactional
public class MykartDAOImpl implements MykartDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public MykartDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}
	
	
	public Mykart getById(String id) {
		return 	(Mykart)  sessionFactory.getCurrentSession().get(Mykart.class, id);
		
		
	}

	@SuppressWarnings("unchecked")
	public List<Mykart> list() {
		return  sessionFactory.getCurrentSession().createQuery("from Mykart").list();

	}

	public boolean validate(String id, String password) {
		Query query=sessionFactory.getCurrentSession().createQuery(" from Mykart where id = ? and password = ?");
		query.setString(1, id);     
		query.setString(2, password);
		 if(  query.uniqueResult()  == null)
		 {
			 
			 return false;
		 }
		 else
		 {
			 
			 return true;
		 }
		
		}
	

	public void delete(String id) {
		Mykart mykartToDelete = new Mykart();
		mykartToDelete.setKartid(id);
		sessionFactory.getCurrentSession().delete(mykartToDelete);
			
	}


	public boolean saveOrUpdate(Mykart mykart) {
		try
		{
		sessionFactory.getCurrentSession().saveOrUpdate(mykart);
		}catch (Exception e) {
						e.printStackTrace();
			return false;
		}
		return true;
	}


	public List<Mykart> getByEmailId(String email) {
		String hql = "from Mykart where email ='" + email +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Mykart> list = (List<Mykart>) query.list();
		
		return list;
	}


	public Mykart getByProductname(String productname) {
		String hql = "from Mykart where Productname ='" + productname + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Mykart> listMykart = (List<Mykart>) (query).list();

		if (listMykart != null && !listMykart.isEmpty()) {
			return listMykart.get(0);
		}
		return null;
	}


	public Long getTotalAmount(int name) {
		String hql = "select sum(total) from Mykart where username = " + "'" + name + "'" + "and status = '" + "N" +"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		Long sum = (Long) query.uniqueResult();
			return sum;
	}


	public boolean itemAlreadyExist(String email, int id, boolean b) {
		String hql = "from Mykart where emailId= '" + email + "' and " + " productId ='" + id+"'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Mykart> list = (List<Mykart>) query.list();
		if (list != null && !list.isEmpty()) {
			return true;
		}
		return false;
	}


	public Mykart getByUserandProduct(String email, int id) {
		String hql = "from Mykart where emailId= '" + email + "' and " + " productId ='" + id+"'";
		org.hibernate.Query query = sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Mykart> listMykart = (List<Mykart>) query.list();
		
		if (listMykart != null && !listMykart.isEmpty()){
			return listMykart.get(0);
		}
		return null;
	}


	public void updateshipping(String email, int sid) {
		// TODO Auto-generated method stub
		String hql = " update Mykart set shippingId = '" + sid + "' where emailId = '" + email + "'";
		sessionFactory.getCurrentSession().createQuery(hql);
	}
}		
	
	


