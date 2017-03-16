package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class sellerHubController {
	
	@RequestMapping("/seller")
	public String showSellsHomePage(ModelMap map)
	   {
		return "sellsHome";
	   }
	@RequestMapping("/pricing")
	public String showSellerPricingPage(ModelMap map)
	   {
		return "sellsPricing";
	   }
	@RequestMapping("/faq")
	 public String showSellerFaqPage(ModelMap map)
	   {
		return "sellsFAQ";
	   }
	@RequestMapping("/benefits")
	public String showSellerBenefitsPage(ModelMap map)
	  {
	    return "sellsBenifits";
	  }
}
