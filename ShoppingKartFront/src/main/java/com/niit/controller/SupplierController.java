package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingkart.dao.SupplierDAO;
import com.niit.shoppingkartback.domain.Product;
import com.niit.shoppingkartback.domain.Supplier;

@Controller
public class SupplierController {
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("newSupplier")
	public String newUser(@ModelAttribute Supplier supplier, Model model){
		supplierDAO.saveOrUpdate(supplier);
		model.addAttribute("isUserClickedSupplier", "true");
		return "Home";
		
	}
	
	@RequestMapping("/SupplierPage")
	public String supplierPage(Model model)
	{
		model.addAttribute("isAdmin", "true");
		model.addAttribute("isAdminClickedSupplier", "true");
		return "adminLogin";
	}
	
	@RequestMapping("/ViewSupplierPage")
	public String ViewSupplierPage(Model model)
	{
		List<Supplier>supplierList = supplierDAO.list();
		model.addAttribute("supplierList", supplierList);
			
		
		model.addAttribute("isAdmin", "true");

		model.addAttribute("isAdminClickedViewSupplier", "true");
		return "adminLogin";
	}
	
	@RequestMapping("/EditSupplierPage")
	public String EditSupplierPage(Model model)
	{
		model.addAttribute("isAdmin", "true");

		model.addAttribute("isAdminClickedEditSupplier", "true");
		return "adminLogin";
	
	
	}
}
