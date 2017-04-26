package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.User;

@Controller
public class UserController {

	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping("newUser")
	public String newUser(@ModelAttribute User user, Model model){
		userDAO.saveOrUpdate(user);
		model.addAttribute("isUserClickedLogin", "true");
		return "Home";
		
	}
	
	/*@RequestMapping("signIn")
	public String signIn(){
		System.out.println("igdgaigycibchayuagxjhhbaudauydhhd");
		return "Home";
	}
*/}
