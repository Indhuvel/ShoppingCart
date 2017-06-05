package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkart.dao.SupplierDAO;
import com.niit.shoppingkartback.domain.Category;
import com.niit.shoppingkartback.domain.Product;
import com.niit.shoppingkartback.domain.Supplier;
import com.niit.util.FileUtil;

@Controller
public class ProductController {

	@Autowired(required = true)
	private ProductDAO productDAO;

	@Autowired(required = true)
	private CategoryDAO categoryDAO;
	
	@Autowired(required = true)
	private Product product;

	@Autowired(required = true)
	private SupplierDAO supplierDAO;
	
	@RequestMapping("newProduct")
	public String newUser(@ModelAttribute Product product,  @RequestParam("image") MultipartFile file,Model model){
		String path = "C://Users/indhu vel/workspace/ShoppingKartFront/src/main/webapp/WEB-INF/resources/images/products/";
		
		productDAO.saveOrUpdate(product);
		FileUtil.upload(path, file, product.getId()+ ".jpg");
		
		model.addAttribute("isUserClickedProducts", "true");
		return "redirect:ViewProducts";
		
	}

 @RequestMapping("/ProductsPage")
	public String productsPage(Model model)
	{
	List<Category> categoryList = categoryDAO.list();
	List<Supplier> supplierList = supplierDAO.list();
	model.addAttribute("categoryList", categoryList);
	model.addAttribute("supplierList", supplierList);

		model.addAttribute("isAdminClickedProducts", "true");
		return "adminLogin";
	}
	
	
	@RequestMapping("/ViewProductsPage")
	public String ViewProductsPage(Model model)
	{
		List<Product> productList = productDAO.list();
		model.addAttribute("productList", productList);
		
		model.addAttribute("isAdminClickedViewProducts", "true");
		return "adminLogin";
	}
	
	@RequestMapping("editProducts")
	public String editProducts(@RequestParam("productId") String productId, Model model){
		List<Category> categoryList = categoryDAO.list();
		List<Supplier> supplierList = supplierDAO.list();
		
		Product product = productDAO.getById(productId);
		model.addAttribute("product", product);
		model.addAttribute("categoryList", categoryList);
		model.addAttribute("supplierList", supplierList);
		model.addAttribute("isAdminClickedEditProducts", true);
		return "adminLogin";
	}
	@RequestMapping("afterEditproducts")
    public String afterEdit(@ModelAttribute Product product){
	productDAO.saveOrUpdate(product);
	return "redirect:ViewProductsPage";
}

	
	@RequestMapping("deleteProducts")
	public String deleteProducts(@RequestParam(value = "productId") String id){
		productDAO.delete(id);
		return "redirect:/ViewProductsPage";
		
	}
	
	
	@ModelAttribute
	public void adminProducts(Model model){
		model.addAttribute("isAdmin", "true");
	}

	}


