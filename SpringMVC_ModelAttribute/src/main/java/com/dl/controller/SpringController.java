package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dl.model.Student;

@Controller
@RequestMapping("/")
public class SpringController {
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String studentRegistrationForm() {
		return "index";
		}
	//@RequestMapping(value="studentValues",method=RequestMethod.POST)
	//public ModelAndView studentValues(@ModelAttribute("student")Student student) {
		//ModelAndView modelAndView = new ModelAndView("studentform");
	////modelAndView.addObject("student", student);
		//return modelAndView;
		
	//}
	
	@RequestMapping(value="studentValues",method=RequestMethod.POST)
	public ModelAndView studentValues(
		@RequestParam("id") int id,
		@RequestParam("firstName") String firstName,
		@RequestParam("lastName") String lastName,
		@RequestParam("contact") long contact,
		@RequestParam("location") String location) {
		Student student = new Student(id,firstName,lastName,contact,location);
		ModelAndView modelAndView = new ModelAndView("studentform");
		modelAndView.addObject("student",student);
		
		return modelAndView;
	
}


}
