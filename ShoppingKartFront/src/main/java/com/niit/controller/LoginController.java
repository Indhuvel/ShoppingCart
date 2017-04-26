package com.niit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.niit.shoppingkart.dao.UserDAO;
@Controller

public class LoginController {
	@Autowired
	private UserDAO userDAO;
	

	@RequestMapping("signIn")
	public ModelAndView showMessage(String email, String password) {
		System.out.println("in controller");
		String message;
		if (userDAO.isValidCredentials(email, password)) {
			message = "Valid Credentials";
		} else {
			message = "Invalid Credentials";
		}
		ModelAndView mv = new ModelAndView("Home");
		mv.addObject("message", message);
		mv.addObject("email", email);
		return mv;
	}
}