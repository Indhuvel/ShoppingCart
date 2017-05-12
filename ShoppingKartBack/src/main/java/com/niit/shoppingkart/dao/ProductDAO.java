package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Product;

public interface ProductDAO {
	public List<Product> list();

	public Product getById(String id);
	public Product getByName(String name);
		
   public void saveOrUpdate(Product product);

	public void delete(String id);


}
