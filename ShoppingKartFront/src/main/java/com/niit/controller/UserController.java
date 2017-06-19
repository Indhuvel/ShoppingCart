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
import com.niit.shoppingkart.dao.ShippingaddressDAO;
import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkart.dao.BillingaddressDAO;
import com.niit.shoppingkartback.domain.Billingaddress;
import com.niit.shoppingkartback.domain.Product;
import com.niit.shoppingkartback.domain.Role;
import com.niit.shoppingkartback.domain.Shippingaddress;
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
	
	@Autowired 
	private ShippingaddressDAO shippingaddressDAO;
	@Autowired 
	private BillingaddressDAO billingaddressDAO;;

	
	@RequestMapping("newUser")
	public String newUser(@ModelAttribute User user,@ModelAttribute Shippingaddress shippingaddress, @ModelAttribute Billingaddress billingaddress, Model model){

		String  message;
		
		if(userDAO.isAllReadyRegister(user.getEmail(), true))	
		{
			
     message = "Your EmailId  Allready Registered";
			
		} 
		else {
		role.setRole("ROLE_USER");
		role.setUsername(user.getUsername());
		role.setContact(user.getContact());
		role.setEmail(user.getEmail());
		user.setEnabled(true);
		
		user.setRole(role);
		role.setUser(user);
		
		
		userDAO.saveOrUpdate(user);
		roleDAO.saveOrUpdate(role);
		
		shippingaddress.setEmail(user.getEmail());
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		
		billingaddress.setEmail(user.getEmail());
	  billingaddressDAO.saveOrUpdate(billingaddress);
	  message="Your Have Successfully Registered";
		}
		model.addAttribute("message",message);
		model.addAttribute("isUserClickedLogin", "true");
		return "Home";
		
	}
	@RequestMapping("/afterlogin")
	public String afterlogin(Principal p, Model model){
		String mailid = p.getName();
		User user = userDAO.getById(mailid);
		
		Role role = roleDAO.getByEmail(mailid);
		
		String r = role.getRole();
		System.out.println(r);
		if(r.equals("ROLE_ADMIN")){
			
			model.addAttribute("isAdmin", "true");

			return "adminLogin";
		}
		else if(r.equals("ROLE_USER")){
			
			
			List<Product> productList = productDAO.list();
			model.addAttribute("productList", productList);
			
			model.addAttribute("isUser", "true");

			return "userLogin";
		}
		else{
			model.addAttribute("error", "Invalid username or password!");
			return "home";
		}
}
}