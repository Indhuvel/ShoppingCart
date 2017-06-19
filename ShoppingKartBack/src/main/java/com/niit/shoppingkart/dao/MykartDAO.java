 package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Mykart;

public interface MykartDAO {
	
	public Mykart getByKartId(int kartid);
	
	public List<Mykart> list();
	
	public boolean validate(String kartid, String password);
	
	public void delete(int kartid);
	
	public boolean save(Mykart mykart);
	
	public boolean update(Mykart mykart);
	
	public  List<Mykart> getByEmail(String email);

	public Mykart getByProductId(int productId);
	
	public Long getTotal(String id);

	public boolean itemAlreadyExist(String email, String productId);

	public Mykart getByUserandProduct(String email, String productId);
	
	public void updateshipping(String email, int sid);

	public List<Mykart> listCartByStatus(String email, char status) ;

}
