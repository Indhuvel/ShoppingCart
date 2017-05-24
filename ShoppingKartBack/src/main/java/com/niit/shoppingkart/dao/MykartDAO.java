 package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Mykart;

public interface MykartDAO {
	public Mykart getById(String id);
	
	public List<Mykart> list();
	
	public boolean validate(String id, String password);
	
	public void delete(String id);
	
	public boolean saveOrUpdate(Mykart mykart);
	
	public  List<Mykart> getByEmailId(String email);

	public Mykart getByProductname(String productname);	
	
	public Long getTotalAmount(int id);

	public boolean itemAlreadyExist(String email, int id, boolean b);

	public Mykart getByUserandProduct(String email, int id);

	public void updateshipping(String email, int sid);

}
