package com.niit.controller;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkartback.domain.Category;
import com.niit.shoppingkartback.domain.Product;

@Controller
public class HomeController {
	
	//http://localhost:8080/ShoppingCart/
	@Autowired HttpSession session;
	@Autowired Category category;
	@Autowired CategoryDAO categoryDAO;
	@Autowired Product product;
	@Autowired ProductDAO productDAO;

	 @RequestMapping("/")
	public ModelAndView goToHome(Model model){
		     
		/*model.addAttribute("message", "Thank you for visiting Shopping Cart");
		return "Home";*/
		ModelAndView mv=new ModelAndView("Home");
		mv.addObject("message", "Thank you for visiting Shopping Cart");
		
		List<Category> categoryList= categoryDAO.list();
		
		model.addAttribute("Carousel", "true");
		session.setAttribute("categoryList",categoryList);
		session.setAttribute("category", category);
		session.setAttribute("productList",productDAO.list());
		session.setAttribute("product", product);
		
		
	
		return mv;
	}
	
	
	@RequestMapping("/loginPage")
	public String loginPage(@RequestParam(value = "error", required = false) String error, 
			@RequestParam(value = "logout", required = false) String logout,Model model)
	{
	
		if(error != null) {
			model.addAttribute("error", "Emailid or Password Incorrect");
			}
		
		if(logout != null) {
			model.addAttribute("logout", "Logged out Successfully");
			}
		model.addAttribute("isUserClickedLogin", "true");
	
		
		return "Home";
	}
	
	
	
	@RequestMapping("/RegistrationPage")
	public String registrationPage(Model model)
	{
		model.addAttribute("isUserClickedRegister", "true");
		
		return "Home";
	}
	
	/*@RequestMapping("/ProductsPage")
	public String productsPage(Model model)
	{List<Category> categoryList = categoryDAO.list();
	List<Supplier> supplierList = supplierDAO.list();
	model.addAttribute("categoryList", categoryList);
	model.addAttribute("supplierList", supplierList);
	model.addAttribute("addProductClicked", true);

		model.addAttribute("isUserClickedProducts", "true");
		
		return "adminLogin";
	}*/
	/*@RequestMapping("/SupplierPage")
	public String supplierPage(Model model)
	{
		model.addAttribute("isUserClickedSupplier", "true");
		
		return "adminLogin";
	}
	@RequestMapping("/CategoryPage")
	public String categoryPage(Model model)
	{
		model.addAttribute("isUserClickedCategory", "true");
		
		return "adminLogin";
	}*/
}