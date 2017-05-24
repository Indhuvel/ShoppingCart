package com.niit.shoppingkartback;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingkart.dao.BillingaddressDAO;
import com.niit.shoppingkart.dao.CategoryDAO;
import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkart.dao.RoleDAO;
import com.niit.shoppingkart.dao.ShippingaddressDAO;
import com.niit.shoppingkart.dao.SupplierDAO;
import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.Billingaddress;
import com.niit.shoppingkartback.domain.Category;
import com.niit.shoppingkartback.domain.Product;
import com.niit.shoppingkartback.domain.Role;
import com.niit.shoppingkartback.domain.Shippingaddress;
import com.niit.shoppingkartback.domain.Supplier;
import com.niit.shoppingkartback.domain.User;

public class UserTest {

	public static void main(String args[]){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingkart");
		context.refresh();
		
		System.out.println("hai");
		
		UserDAO userDAO = (UserDAO) context.getBean("UserDAO");
		CategoryDAO categoryDAO= (CategoryDAO) context.getBean("CategoryDAO");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("SupplierDAO");
		ProductDAO productDAO = (ProductDAO) context.getBean("ProductDAO");
		ShippingaddressDAO shippingaddressDAO = (ShippingaddressDAO) context.getBean("ShippingaddressDAO");
		BillingaddressDAO billingaddressDAO = (BillingaddressDAO) context.getBean("BillingaddressDAO");
		RoleDAO roleDAO = (RoleDAO) context.getBean("RoleDAO");

		
		User user = (User) context.getBean("user");
		Category category = (Category) context.getBean("category");
		Supplier supplier = (Supplier) context.getBean("supplier");
		Product product= (Product) context.getBean("product");
		Shippingaddress shippingaddress=(Shippingaddress)context.getBean("shippingaddress");
		Billingaddress billingaddress=(Billingaddress)context.getBean("billingaddress");
		Role role = (Role) context.getBean("role");

		user.setcontact("9876543210");
		user.setUsername("Priya");
		user.setPassword("priya");
		user.setAddress("xyz");
	    user.setEmail("abc@gmail.com");	
		
	    category.setCategoryname("mobile");
		category.setCategorydescription("world's best choice");
		
		supplier.setSuppliername("Sony");
		supplier.setAddress("XY");
		supplier.setEmail("sony@gmail.com");
		supplier.setContact("0422673288");
		supplier.setCitycode("641054");
		supplier.setSupplierdescription("new");
		
		product.setProductname("micromax");
		product.setPrice(9500);
		product.setDescription("best battery life");
		product.setStock(13);
		product.setCategory("mb");
		product.setSuppliername("max");
		
		shippingaddress.setUsername("jenu");
		shippingaddress.setEmail("jenu@gmail.com");
		shippingaddress.setContact("9012679872");
		shippingaddress.setAddress("mumbai");
		shippingaddress.setCitycode(972297);
		
		
        billingaddress.setEmail("mm@gmail.com");
		billingaddress.setAddress("delhi");
		billingaddress.setCitycode(890005);
		billingaddress.setUsername("ram");
		billingaddress.setContact("908764326");
		
		
		role.setUsername("Vel");
		role.setContact("8934512676");
		role.setEmail("vel23@yahoo.com");
		role.setRole("User");
		
		
		userDAO.saveOrUpdate(user);
		categoryDAO.saveOrUpdate(category);
		supplierDAO.saveOrUpdate(supplier);
		productDAO.saveOrUpdate(product);
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		billingaddressDAO.saveOrUpdate(billingaddress);
	    roleDAO.saveOrUpdate(role);

	}

}
