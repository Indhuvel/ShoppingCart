package com.niit.shoppingkart.daoimp;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkartback.domain.Category;

@Transactional
@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}

	
	@SuppressWarnings("unchecked")
	public List<Category> list() {
		return sessionFactory.getCurrentSession().createQuery("from Category").list();
	
	}

	public void saveOrUpdate(Category category) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	public Category getById(String id) {
		String hql = "from Category where id ='" + id + "'";
		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) (query).list();

		if (listCategory != null && !listCategory.isEmpty()) {
			return listCategory.get(0);
		}
		return null;
	}

	public void delete(String id) {
		// TODO Auto-generated method stub
		Category categoryToDelete = new Category();
		categoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(categoryToDelete);
	}
    /*public Category getByName(String name){
	return (Category)getCurrentSession().createQuery("from Category where name=?")
	.setString(0,name).uniqueResult();}*/

	public Category getByName(String category ) {
		
		Query query=  getCurrentSession().createQuery("from Category where name =?");
		query.setString(0, category);
		
		
	  return (Category)	query.uniqueResult();
		
	}
	
}

