package com.niit.controller;

import java.security.Principal;
import java.sql.Date;
import java.util.List;
import java.util.Random;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.shoppingkart.dao.MykartDAO;
import com.niit.shoppingkart.dao.ProductDAO;
import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.Mykart;
import com.niit.shoppingkartback.domain.Product;
import com.niit.shoppingkartback.domain.User;

@Controller
public class KartController {
	@Autowired
	private MykartDAO mykartDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	
@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private Mykart mykart;
	
	@RequestMapping("/MykartPage")
	public String MykartPage(Principal principal, Model model) {
		String email = principal.getName();
		User user = userDAO.getByMailId(email);
		List<Mykart> mykartList = mykartDAO.getByEmail(email);
		Long GrandTotal =mykartDAO.getTotal(user.getId()); 
		
		model.addAttribute("GrandTotal ",GrandTotal );
		model.addAttribute("mykartList", mykartList);
		model.addAttribute("isUserClickerdAddtoKart", true);
		return "userLogin";
	  
	
	}
	
	@RequestMapping("productDetails")
	public String productDetails(@RequestParam("id") String id,Model model)
	{		

		Product product=productDAO.getById(id);
		model.addAttribute("productDetails", true);
		model.addAttribute("product", product);
		
		//model.addAttribute("isUser", "true");

		return "Home";
	}
	
	
	@RequestMapping("addtokart")
	public String addtokart(@RequestParam("productId") String productId, Principal p, Model model){
		
		Product product = productDAO.getById(productId);		
		String email = p.getName();
		User user = userDAO.getByMailId(email);;	
		List<Mykart> mykartList = mykartDAO.getByEmail(email);
		model.addAttribute("mykartList", mykartList);

		Mykart mykart = mykartDAO.getByUserandProduct(p.getName(), productId);
if(product.getStock() > 0 ){
			
			if(mykartDAO.itemAlreadyExist(p.getName(), productId, true)){
				int quantity = mykart.getQuantity() + 1;
				mykart.setQuantity(quantity);
				mykart.setTotal(product.getPrice() * quantity);
				mykartDAO.saveOrUpdate(mykart);
			}
			
		mykart.setEmail(p.getName());
		mykart.setPrice(product.getPrice());
		mykart.setProductname(product.getProductname());
		mykart.setQuantity(1);
		mykart.setStatus("N");
		mykart.setUsername(user.getUsername());
		mykart.setTotal(product.getPrice()*mykart.getQuantity());
        mykart.setDays(1);
		Long currentTime=System.currentTimeMillis();
		Date currentDate=new Date(currentTime);
		mykart.setDate(currentDate);

		mykartDAO.saveOrUpdate(mykart);}
		
		model.addAttribute("isUserClickerdViewDetails", true);
		model.addAttribute("isUserClickerdAddtoKart", true);

		return "userLogin";
	}
	@RequestMapping("removekart")
		public String removekart(@RequestParam("kartid")int kartid,Model model){
	mykartDAO.delete(kartid);
	return "redirect:MykartPage";
	}

}
