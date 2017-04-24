package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Billingaddress;

public interface BillingaddressDAO {
	public List<Billingaddress> list(String id);

	public Billingaddress get(String id);

	public void saveOrUpdate(Billingaddress billingaddress);

	public void delete(String bid);
}
