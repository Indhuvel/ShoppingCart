package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Shippingaddress;


public interface ShippingaddressDAO {
	public List<Shippingaddress> list(String id);

	public Shippingaddress get(String uname);

	public void saveOrUpdate(Shippingaddress shippingaddress);

	public void delete(String sid);
}
