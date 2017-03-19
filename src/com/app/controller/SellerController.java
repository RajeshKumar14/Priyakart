package com.app.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Seller;
import com.app.service.ISellerService;

@Controller
public class SellerController {
	
	@Autowired
	private ISellerService service;
	
	//=====Seller Hub=======
	@RequestMapping("/sells")
	public String showSellsHomePage()
	   {
		return "sellsHome";
	   }
	@RequestMapping("/pricing")
	public String showSellerPricingPage()
	   {
		return "sellsPricing";
	   }
	@RequestMapping("/faq")
	 public String showSellerFaqPage()
	   {
		return "sellsFAQ";
	   }
	@RequestMapping("/benefits")
	public String showSellerBenefitsPage()
	  {
	    return "sellsBenifits";
	  }
	
	//=========Seller===========
	
	@RequestMapping("/seller")
	public String showSellerHomePage()
	  {
	    return "sellerDashboard";
	  }
	@RequestMapping("/regSeller")
	public String showSellerRegPage()
	  {
	    return "SellerReg";
	  }
	/**
	 * Send data to the Rest Client
	 * 1.read seller from Container using ModelAttribute
	 */
	@RequestMapping(value="/insertSeller",method=RequestMethod.POST)
	public String saveSellerData(@ModelAttribute("Seller")Seller seller,ModelMap map)
	   {
	String msg=service.saveSeller(seller);
	   map.addAttribute("msg", msg);
		return "SellerReg";
      }	
	
	
	/**
	 * Login process
	 */
	@RequestMapping(value="/loginSeller",method=RequestMethod.POST)
	public String doLoginSeller(
			@RequestParam("sellerId")String sellerEmail,
			@RequestParam("password")String Pwd,
			HttpServletRequest req,ModelMap map){
	
		String pageName=null;
		
		String msg=service.getSellerByUmailAndPwd(sellerEmail, Pwd);
		if(msg==sellerEmail){
			//create session and goto home page
			HttpSession ses=req.getSession();
			ses.setAttribute("msg", msg);
			pageName="SellerDashboard";
		}else{
			//create error msg and goto login page
			map.addAttribute("msg",msg);
			pageName="SellsHome";
		}
		
	 return pageName;	
	}
	
	/**
	 * Logout process
	 */
	@RequestMapping("/sellerLogout")
	public String doLogout(HttpServletRequest req,ModelMap map){
		//read current session of user
		HttpSession ses=req.getSession(false);
		ses.setAttribute("sellerFirstName", null);
		ses.invalidate();
		map.addAttribute("msg", "Logout success...");
		return "priyakart";
	}
	
}
