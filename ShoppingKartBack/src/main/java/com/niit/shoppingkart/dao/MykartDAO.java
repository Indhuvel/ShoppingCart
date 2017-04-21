package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Mykart;

public interface MykartDAO {
	public Mykart getById(String id);
	public List<Mykart> list();
	
	public boolean validate(String id, String password);
	public void delete(String id);
	public boolean saveOrUpdate(Mykart mykart);


}
