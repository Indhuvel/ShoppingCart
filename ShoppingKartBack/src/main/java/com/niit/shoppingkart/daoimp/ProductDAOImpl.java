package com.niit.shoppingkart.daoimp;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkartback.domain.Product;

@Transactional
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	@SuppressWarnings("unchecked")
	public List<Product> list() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public Product getById(String id) {
		Product product = (Product) sessionFactory.getCurrentSession().get(Product.class, id);
		 
		 return product;
	}

	public void saveOrUpdate(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);

	}

	public void delete(String id) {
		Product productToDelete = new Product();
		productToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(productToDelete);
			
	}

	public Product getByName(String name) {
		Query query=  getCurrentSession().createQuery("from Product where name =?");
		query.setString(0, name);
		
		
	  return (Product)	query.uniqueResult();
		
	}

	public List<Product> getAllProductsByCategoryID(String categoryID) {
		Query query=	getCurrentSession().createQuery("from Product where categoryID=?");
		query.setString(0, categoryID);
		
	    return	query.list();
			
	}
	public List<Product> getSimilarProducts(String search_string) {
		// TODO Auto-generated method stub
		return null;
	}
}
