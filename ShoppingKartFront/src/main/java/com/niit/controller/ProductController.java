package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkartback.domain.Product;

@Controller
public class ProductController {
	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("newProduct")
	public String newUser(@ModelAttribute Product product, Model model){
		productDAO.saveOrUpdate(product);
		model.addAttribute("isUserClickedProducts", "true");
		return "Home";
		
	}
}
