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
		
		List<Mykart> mykartList = mykartDAO.getByEmail(principal.getName());
 		Long GrandTotal = mykartDAO.getTotal(principal.getName());

		model.addAttribute("GrandTotal", GrandTotal);
		model.addAttribute("mykartList", mykartList);
		model.addAttribute("isUserClickerdAddtoKart", true);
		return "userLogin";

	}

	@RequestMapping("productDetails")
	public String productDetails(@RequestParam("id") String id, Model model) {

		Product product = productDAO.getById(id);
		model.addAttribute("productDetails", true);
		model.addAttribute("product", product);

		// model.addAttribute("isUser", "true");

		return "Home";
	}

	@RequestMapping("addtokart")
	public String addtokart(@RequestParam("productId") String productId, Principal p, Model model) {

		Product product = productDAO.getById(productId);
		String email = p.getName();
		User user = userDAO.getByMailId(email);

		Mykart mykrt = mykartDAO.getByUserandProduct(p.getName(), productId);
/*System.out.println(mykrt.getQuantity());*/
		if (product.getStock() > 0) {

			if (mykartDAO.itemAlreadyExist(p.getName(), productId, true)) {
				
				int qty = mykrt.getQuantity() + 1;
				mykrt.setQuantity(qty);
				mykrt.setTotal(product.getPrice() * qty);
				boolean flag = mykartDAO.saveOrUpdate(mykrt);
				System.out.println(flag);
				System.out.println(qty);
			} else {
				Random t = new Random();
				int day = 2 + t.nextInt(7);
				
				mykart.setEmail(p.getName());
				mykart.setPrice(product.getPrice());
				mykart.setProductname(product.getProductname());
				mykart.setProductid(product.getId());
				mykart.setQuantity(1);
				mykart.setStatus("N");
				mykart.setUsername(user.getUsername());
				mykart.setTotal(product.getPrice() * mykart.getQuantity());
				mykart.setDays(day);
				Long currentTime = System.currentTimeMillis();
				Date currentDate = new Date(currentTime);
				mykart.setDate(currentDate);

				boolean flag = mykartDAO.saveOrUpdate(mykart);
				System.out.println(flag);

			}
			int stc = product.getStock() - 1;
			product.setStock(stc);

			productDAO.saveOrUpdate(product);
			return "redirect:MykartPage";
		}
		else {
			model.addAttribute("product", product);

			model.addAttribute("productDetails", true);
		
			model.addAttribute("message", "Out of stock");
			return "userLogin";
		}
	}

	@RequestMapping("removekart")
	public String removekart(@RequestParam("kartid") int kartid, Model model) {
		
		Mykart mykart = mykartDAO.getByKartId(kartid);
		Product product = productDAO.getById(mykart.getProductid());
		
		int qty = product.getStock() + mykart.getQuantity();
		
		product.setStock(qty);
		productDAO.saveOrUpdate(product);
		
		mykartDAO.delete(kartid);
		return "redirect:MykartPage";
	}
	@ModelAttribute
	public void commonToUser(Model model){
		model.addAttribute("isUser", "true");
	}
}
