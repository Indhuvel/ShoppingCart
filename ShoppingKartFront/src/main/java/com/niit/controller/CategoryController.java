package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkartback.domain.Category;

@Controller
public class CategoryController {
	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping("newCategory")
	public String newUser(@ModelAttribute Category category, Model model) {
		categoryDAO.saveOrUpdate(category);
		model.addAttribute("isUserClickedCategory", "true");
		return "Home";

	}

	@RequestMapping("/CategoryPage")
	public String categoryPage(Model model) {
		model.addAttribute("isAdmin", "true");
		model.addAttribute("isAdminClickedCategory", "true");

		return "adminLogin";
	}

	@RequestMapping("/ViewCategoryPage")
	public String ViewCategoryPage(Model model) {

		List<Category> categoryList = categoryDAO.list();
		model.addAttribute("categoryList", categoryList);
		
		model.addAttribute("isAdmin", "true");
		model.addAttribute("isAdminClickedViewCategory", "true");
		return "adminLogin";
	}
	@RequestMapping("editCategory")
	public String editCategory(@RequestParam("categoryId") String categoryId, Model model){
		
		Category category = categoryDAO.getById(categoryId);
		model.addAttribute("category", category);
		model.addAttribute("isAdminClickedEditCategory", true);
		return "adminLogin";
	
}
	@RequestMapping("afterEditcategory")
	public String afterEdit(@ModelAttribute Category category){
		categoryDAO.saveOrUpdate(category);
		return "redirect:ViewCategoryPage";
	}
	@RequestMapping("deleteCategory")
	public String deleteCategory(@RequestParam(value = "categoryId") String id){
		categoryDAO.delete(id);
		return "redirect:/ViewCategoryPage";
		
	}
	@ModelAttribute
	public void adminCategory(Model model){
		model.addAttribute("isAdmin", "true");
	}
	

}