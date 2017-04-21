package com.niit.shoppingkartback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkart.dao.SupplierDAO;
import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.Category;
import com.niit.shoppingkartback.domain.Product;
import com.niit.shoppingkartback.domain.Supplier;
import com.niit.shoppingkartback.domain.User;

public class UserTest {

	public static void main(String args[]){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.*");
		context.refresh();
		
		System.out.println("hai");
		
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		CategoryDAO categoryDAO= (CategoryDAO) context.getBean("CategoryDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");

		User user = (User) context.getBean("user");
		Category category = (Category) context.getBean("category");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Product product= (Product) context.getBean("product");
		
	
		user.setcontact("9876543210");
		user.setName("Priya");
		user.setPassword("priya");
		user.setRole("ROLE_USER");
		user.setAddress("xyz");
	    user.setEmail("abc@gmail.com");	
		
	    category.setName("mobile");
		category.setDescription("worlds best choice");
		
		supplier.setName("Sony");
		supplier.setAddress("XY");
		supplier.setEmail("sony@gmail.com");
		
		product.setName("micromax");
		product.setPrice("9500");
		product.setDescription("best battery life");
		product.setCategory_id("1010");
		product.setSupplier_id("MX10");
		
		userDAO.saveOrUpdate(user);
		categoryDAO.saveOrUpdate(category);
		supplierDAO.saveOrUpdate(supplier);
		productDAO.saveOrUpdate(product);
	}

}
