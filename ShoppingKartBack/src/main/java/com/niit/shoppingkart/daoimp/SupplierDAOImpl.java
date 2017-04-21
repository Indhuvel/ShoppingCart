package com.niit.shoppingkart.daoimp;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingkart.dao.SupplierDAO;
import com.niit.shoppingkartback.domain.Supplier;

@Transactional
@Repository("SupplierDAO")
public class SupplierDAOImpl implements SupplierDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public SupplierDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<Supplier> list() {
		return sessionFactory.getCurrentSession().createQuery("from Supplier").list();

	}

	public Supplier getById(String id) {
		Supplier supplier = (Supplier) sessionFactory.getCurrentSession().get(Supplier.class, id);

		return supplier;
	}

	public void saveOrUpdate(Supplier supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);

	}

	public void delete(String id) {
		Supplier supplierToDelete = new Supplier();
		supplierToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(supplierToDelete);

	}

}
