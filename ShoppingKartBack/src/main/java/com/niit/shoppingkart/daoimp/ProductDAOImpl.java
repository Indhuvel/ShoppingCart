package com.niit.shoppingkart.daoimp;

import java.util.List;
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
}
