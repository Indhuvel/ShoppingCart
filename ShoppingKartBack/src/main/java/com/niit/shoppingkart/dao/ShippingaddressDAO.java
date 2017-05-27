package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Shippingaddress;


public interface ShippingaddressDAO {
	public List<Shippingaddress> list();
	
	public List<Shippingaddress> list(String email);
	
	public Shippingaddress getByShippingAddress(String address);


	public Shippingaddress getByUserName(String username);

	public void saveOrUpdate(Shippingaddress address);

	public void delete(String sid);
	
	public Shippingaddress getBySid(String sid);

	

}
