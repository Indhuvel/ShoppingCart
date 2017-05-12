package com.niit.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkart.dao.RoleDAO;
import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.Product;
import com.niit.shoppingkartback.domain.Role;
import com.niit.shoppingkartback.domain.User;

@Controller
public class UserController {

	@Autowired
	private ProductDAO productDAO;

	
	@Autowired
	private RoleDAO roleDAO;

	@Autowired
	private Role role;

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("newUser")
	public String newUser(@ModelAttribute User user, Model model){
		
		role.setRole("ROLE_USER");
		role.setUsername(user.getUsername());
		role.setContact(user.getContact());
		role.setEmail(user.getEmail());
		user.setEnabled(true);
		
		user.setRole(role);
		role.setUser(user);
		
		
		userDAO.saveOrUpdate(user);
		roleDAO.saveOrUpdate(role);
		
		model.addAttribute("isUserClickedLogin", "true");
		return "Home";
		
	}
	@RequestMapping("/afterlogin")
	public String afterLogin(Principal p, Model model){
		String mailid = p.getName();
		User user = userDAO.getById(mailid);
		
		Role role = roleDAO.getByEmail(mailid);
		
		String r = role.getRole();
		
		if(r.equals("ROLE_ADMIN")){
			
			return "adminLogin";
		}
		else if(r.equals("ROLE_USER")){
			
			
			List<Product> productList = productDAO.list();
			model.addAttribute("productList", productList);
			
			return "userLogin";
		}
		else{
			model.addAttribute("error", "Invalid username or password!");
			return "home";
		}
}
}