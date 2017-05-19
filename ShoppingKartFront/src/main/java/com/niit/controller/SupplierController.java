package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.shoppingkart.dao.SupplierDAO;
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
	@RequestMapping("editSupplier")
	public String editSupplier(@RequestParam("supplierId") String supplierId, Model model){
		
		Supplier supplier = supplierDAO.getById(supplierId);
		model.addAttribute("supplier", supplier);
		model.addAttribute("isAdminClickedEditSupplier", true);
		return "adminLogin";
	
}
	@RequestMapping("aftereditsupplier")
	public String afterEdit(@ModelAttribute Supplier supplier){
		supplierDAO.saveOrUpdate(supplier);
		return "redirect:ViewSupplierPage";
	}
	@RequestMapping("deleteSupplier")
	public String deleteSupplier(@RequestParam(value = "supplierId") String id){
		supplierDAO.delete(id);
		return "redirect:/ViewSupplierPage";
		
	}
	@ModelAttribute
	public void adminSupplier(Model model){
		model.addAttribute("isAdmin", "true");
	}
}
