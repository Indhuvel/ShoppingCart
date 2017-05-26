 package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Mykart;

public interface MykartDAO {
	public Mykart getByKartId(String kartid);
	
	public List<Mykart> list();
	
	public boolean validate(String kartid, String password);
	
	public void delete(int kartid);
	
	public boolean saveOrUpdate(Mykart mykart);
	
	public  List<Mykart> getByEmail(String email);

	
	public Long getTotal(String id);

	public boolean itemAlreadyExist(String email, String id, boolean b);

	public Mykart getByUserandProduct(String email, String id);
	public void updateshipping(String email, int sid);

}
