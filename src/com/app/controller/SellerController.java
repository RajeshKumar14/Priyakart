package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
}
