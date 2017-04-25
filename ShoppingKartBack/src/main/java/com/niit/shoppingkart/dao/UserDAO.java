package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.User;

public interface UserDAO {
	
	public User get(String id);

	public List<User> list();

	public boolean isValidCredentials(String email, String password);

	public void saveOrUpdate(User user);

}
