package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.shoppingkart.dao.SupplierDAO;
import com.niit.shoppingkartback.domain.Supplier;


public class SupplierController {
	@Autowired
	private SupplierDAO supplierDAO;
	
	@RequestMapping("newSupplier")
	public String newUser(@ModelAttribute Supplier supplier, Model model){
		supplierDAO.saveOrUpdate(supplier);
		model.addAttribute("isUserClickedSupplier", "true");
		return "Home";
		
	}
}
