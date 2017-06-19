package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.User;

public interface UserDAO {
	
	public User getById(String id);

	public List<User> list();

	public boolean isValidCredentials(String email, String password);

	public void saveOrUpdate(User user);

	public User getByMailId(String mailid);

	public void delete(String id);

	public boolean isAllReadyRegister(String email, boolean b);


}




