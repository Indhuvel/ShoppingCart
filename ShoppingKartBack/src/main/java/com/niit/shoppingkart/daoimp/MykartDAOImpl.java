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
		Query query=	 sessionFactory.getCurrentSession().createQuery(" from Mykart where id = ? and password = ?");
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
		// TODO Auto-generated method stub
		
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
}		
	
	


