package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/Basics")
public class HelloSpringMVC {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(Model model) {

		model.addAttribute("message", "Hello Spring MVC");

		return "hello";
	}
}
