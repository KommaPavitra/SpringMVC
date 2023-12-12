package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/users")
public class UserController {
	@RequestMapping(value="/user/{id}/{firstName}/{lastName}/{contact}/{location}",method=RequestMethod.GET)
	public ModelAndView customerDetails(
			@PathVariable("id")String id,
			@PathVariable("firstName")String firstName,
			@PathVariable("lastName")String lastName,
			@PathVariable("contact")String contact,
			@PathVariable("location")String location
			) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("welcomePage",id +""+firstName+""+lastName+""+contact+""+location+"");
		modelAndView.setViewName("welcomePage");
		modelAndView.addObject("id",id);
		modelAndView.addObject("firstName",firstName);
		modelAndView.addObject("lastName",lastName);
		modelAndView.addObject("contact",contact);
		modelAndView.addObject("location",location);
		
		System.out.println(id);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(contact);
		System.out.println(location);
		
		return modelAndView;
		
		
	}
	
}
