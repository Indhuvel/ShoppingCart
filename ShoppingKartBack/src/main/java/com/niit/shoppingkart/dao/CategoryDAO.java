package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	
	public Category getById(String id);
	
public Category getByName(String category);
	public void saveOrUpdate(Category category);
		
	public void delete(String id);

}

