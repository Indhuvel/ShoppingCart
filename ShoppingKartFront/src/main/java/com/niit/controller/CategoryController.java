package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkartback.domain.Category;


@Controller
public class CategoryController {
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping("newCategory")
	public String newUser(@ModelAttribute Category category, Model model){
		categoryDAO.saveOrUpdate(category);
		model.addAttribute("isUserClickedCategory", "true");
		return "Home";
		
	}
}
