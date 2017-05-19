 package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingkart.dao.RoleDAO;
import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.Role;

@Controller
public class LoginController {
	@Autowired
	private UserDAO userDAO;
	@Autowired
	private RoleDAO roleDAO;

	@Autowired
	private Role role;

	/*@RequestMapping("")
	public String showMessage(@RequestParam(value = "email") String email,
			@RequestParam(value = "password") String password, Model model) {
		System.out.println("in controller");
		// String message;
		String mess;
		if (userDAO.isValidCredentials(email, password)) {

			role = roleDAO.getByEmail(email);
			String u = "ROLE_USER";
			//String admin = "ROLE_ADMIN";
			String r = role.getRole();
			System.out.println(r);

			if (r.equals(u)) {
				mess = "userLogin";
				model.addAttribute("isUser", "true");

			} 
			else {
				mess = "adminLogin";
				model.addAttribute("isAdmin", "true");
			}
			model.addAttribute("message", "Valid Credentials");
			model.addAttribute("email", email);
			return mess;
		} else {

			model.addAttribute("message", "Invalid Credentials");
			mess = "Home";
			
		}
		return mess;
	}*/
}