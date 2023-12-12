package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloControllerMethodLevel {
	
	@RequestMapping("/MethodLevel")
	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView(); //Creates ModelAndView Object
		modelAndView.setViewName("methodlevel"); //methodlevel.jsp
		return modelAndView; //Returns ModelAndView Object
	}
	
	@RequestMapping("/customerDetails")
	public ModelAndView customerDetails() {
	 ModelAndView modelAndView =new ModelAndView();
	 modelAndView.setViewName("hotelCustomer");
	 modelAndView.addObject("id",101);
	 modelAndView.addObject("firstName","sai");
	 modelAndView.addObject("lastName","kiran");
	 modelAndView.addObject("contactNumber",8688228817L);
	 modelAndView.addObject("location","HYD");
	 
	return modelAndView;
	 
	}
	

}
