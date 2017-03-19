package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Consumer;
import com.app.service.IConsumerService;

@Controller
public class ConsumerController {
	
	@Autowired
	private IConsumerService service;
	
	@RequestMapping("/regCons")
	public String showConsumerReg(ModelMap map){
		return "ConsumerReg";
	}
	
	@RequestMapping("/loginCons")
	public String showConsumerLogin(){
		return "ConsumerLogin";
	}
	/**
	 * Send data to the Rest Client
	 * 1.read seller from Container using ModelAttribute
	 */
	@RequestMapping(value="/insertConsumer",method=RequestMethod.POST)
	public String saveSellerData(@ModelAttribute("Consumer")Consumer cons,ModelMap map)
	   {
	String msg=service.saveConsumer(cons);
	   map.addAttribute("msg", msg);
		return "ConsumerReg";
      }	
	
	
	
	
	
	
}
