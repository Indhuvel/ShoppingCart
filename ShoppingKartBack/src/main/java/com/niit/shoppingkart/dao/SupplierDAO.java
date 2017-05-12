package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Supplier;

public interface SupplierDAO {

	public List<Supplier> list();

	public Supplier getById(String id);
public Supplier getByName(String supplier);

	public void saveOrUpdate(Supplier supplier);

	public void delete(String id);

}
