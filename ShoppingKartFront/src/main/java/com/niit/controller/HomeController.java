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
		
		session.setAttribute("categoryList",categoryList);
		session.setAttribute("category", category);
		session.setAttribute("productList",productDAO.list());
		session.setAttribute("product", product);
	
		return mv;
	}
	
	
	@RequestMapping("/loginPage")
	public String loginPage(Model model)
	{
		
		model.addAttribute("isUserClickedLogin", "true");
	
		Long currentTime=System.currentTimeMillis();
		Date currentDate=new Date(currentTime);
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