package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ConsumerController {
	
	@RequestMapping("/regCons")
	public String showConsumerReg(ModelMap map){
		return "ConsumerReg";
	}
	
	@RequestMapping("/loginCons")
	public String showConsumerLogin(){
		return "ConsumerLogin";
	}

}
