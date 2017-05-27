package com.niit.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingkart.dao.MykartDAO;
import com.niit.shoppingkart.dao.ShippingaddressDAO;
import com.niit.shoppingkart.dao.UserDAO;
import com.niit.shoppingkartback.domain.Mykart;
import com.niit.shoppingkartback.domain.Shippingaddress;
import com.niit.shoppingkartback.domain.User;

@Controller
public class ShippingaddressController {
	@Autowired
	private ShippingaddressDAO shippingaddressDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@Autowired
	private MykartDAO mykartDAO;
	
	@Autowired
	private Mykart mykart;
	
	@RequestMapping("ShippingAddressPage")
	public ModelAndView newShippingaddress(){
		
		ModelAndView mv = new ModelAndView("userLogin");
		mv.addObject("ShippingaddressClicked", "true");
		return mv;
	}
	
	@RequestMapping("proceed")
	public String Proceed(Principal p, Model model){
		String email = 	p.getName();
		List<Shippingaddress> shippingList = shippingaddressDAO.list(email);
		model.addAttribute("shippingList", shippingList);
		model.addAttribute("viewShippingAddressClicked", true);
	 return "UserLogin";
	}
}
