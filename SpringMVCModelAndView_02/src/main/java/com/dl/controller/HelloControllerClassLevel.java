
package com.dl.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ClassLevel")
public class HelloControllerClassLevel {

	@RequestMapping
	public ModelAndView hello() {

		ModelAndView modelAndView = new ModelAndView(); //Creates ModelAndView Object
		modelAndView.setViewName("classlevel"); //classlevel.jsp
		return modelAndView; //Returns ModelAndView Object
	}

}
