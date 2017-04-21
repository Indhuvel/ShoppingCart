package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//http://localhost:8080/ShoppingCart/
	
	@RequestMapping("/")
	public ModelAndView goToHome(){
		
		/*model.addAttribute("message", "Thank you for visiting Shopping Cart");
		return "Home";*/
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("message", "Thank you for visiting Shopping Cart");
		return mv;
	}
	
	
	@RequestMapping("/LoginPage")
	public String loginPage(Model model)
	{
		model.addAttribute("isUserClickedLogin", "true");
	
		return "Home";
	}
	
	@RequestMapping("/RegistrationPage")
	public String registrationPage(Model model)
	{
		model.addAttribute("isUserClickedRegister", "true");
		
		return "Home";
	}

	@RequestMapping("/ProductsPage")
	public String productsPage(Model model)
	{
		model.addAttribute("isUserClickedProducts", "true");
		
		return "Home";
	}

}
