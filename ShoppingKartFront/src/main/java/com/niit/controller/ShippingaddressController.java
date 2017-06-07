package com.niit.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("shippingaddressPage")
	public ModelAndView newShippingaddress(){
		
		ModelAndView mv = new ModelAndView("userLogin");
		mv.addObject("newShippingaddressClicked", "true");
		return mv;
	}
	@RequestMapping("proceed")
	public String Proceed(Principal p, Model model){
		String email = 	p.getName();
		List<Shippingaddress> shippingaddressList = shippingaddressDAO.list(email);
		model.addAttribute("shippingList", shippingaddressList);
		model.addAttribute("isUserClickedShippingAddress", true);
	 return "userLogin";
	}
	@RequestMapping("addShippingaddress")
	public String addShippingaddress(Principal p, @ModelAttribute Shippingaddress shippingaddress){
		User user = userDAO.getByMailId(p.getName());
		/*shippingaddress.setUserId(user.getUserId());
		shippingaddress.setEmailId(email);
		*/
		
		shippingaddress.setEmail(p.getName());
		shippingaddress.setEmail(user.getEmail());
		
		
		
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		return "redirect:proceed";
		
	}
	@RequestMapping("shippingAddress")
	public String shippingAddress(@RequestParam("shippingId") int shippingId, Principal p, Model model){
		
		String email = p.getName();
		List<Mykart> mykartList = mykartDAO.getByEmail(email);
		
		for(Mykart c : mykartList){
			c.setSid(shippingId);
			mykartDAO.saveOrUpdate(c);
		}
		model.addAttribute("deliverhereClicked", true);
		model.addAttribute("thankyouPage", true);
		return "userLogin";
		
	}
	@RequestMapping("deleteshippingAddress")
	public String deleteshippingAddress(@RequestParam("shippingId") int shippingId, Model model){
		shippingaddressDAO.delete(shippingId);
		return "redirect:proceed";
		
	}
	@RequestMapping("editshippingAddress")
	public String editshippingAddress(@RequestParam("shippingId")int shippingId,Model model){
	Shippingaddress shippingaddress=shippingaddressDAO.getBySid(shippingId);
		model.addAttribute("shippingaddress", shippingaddress);
		model.addAttribute("editShippingAddressClicked", true);
		return "userLogin";
		
	}
	@RequestMapping("editShippingaddress")
	public String editShippingAddress(Principal p, @ModelAttribute Shippingaddress shippingaddress, Model model){
		
		String email = p.getName();
		User user = userDAO.getByMailId(email);
		
		shippingaddress.setEmail(email);
		shippingaddress.setUsername(user.getEmail());
		
		shippingaddressDAO.saveOrUpdate(shippingaddress);
		return "redirect:proceed";
	}
	
	@RequestMapping("ThankyouPage")
	public String ThankyouPage( Model model){
		model.addAttribute("checkoutClicked", true);
		return "userLogin";
	}
	@ModelAttribute
	public void commonToUser(Model model){
		model.addAttribute("isUser", "true");
	}
}

