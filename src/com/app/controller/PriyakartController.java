package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PriyakartController {
	
	   @RequestMapping("/priyakart")
	   public String showItemHomePage(ModelMap map)
		{
		return "ItemHome";
		}
}
