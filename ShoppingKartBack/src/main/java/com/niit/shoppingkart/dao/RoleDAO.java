package com.niit.shoppingkart.dao;

import java.util.List;

import com.niit.shoppingkartback.domain.Role;

public interface RoleDAO {
	
	public List<Role> list();
	
	public Role getByName(String username);
	
	public Role getByMailId(String Mailid);
	
	public Role getByContact(String contact);

	public void delete(String username);

	public void saveOrUpdate(Role role);

}
