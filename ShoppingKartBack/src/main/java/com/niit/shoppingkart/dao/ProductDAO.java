package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Product;

public interface ProductDAO {
	public List<Product> list();

	public Product getById(String id);
	public Product getByName(String name);
	public List<Product> getAllProductsByCategoryID(String categoryID) ;

   public void saveOrUpdate(Product product);
	public List<Product> getSimilarProducts(String search_string) ;

	public void delete(String id);


}
