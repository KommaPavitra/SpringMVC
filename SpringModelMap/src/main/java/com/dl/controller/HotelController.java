package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {
	@RequestMapping("/Customer")
	public String hotelCustomer(ModelMap model) {
		
		model.addAttribute("id", 101);
		model.addAttribute("firstName", "Sai");
		model.addAttribute("lastName", "Kiran");
		model.addAttribute("contact", 987766543210L);
		model.addAttribute("location", "Hyd");
		
		return "hotelCustomer";
		
	}

}
