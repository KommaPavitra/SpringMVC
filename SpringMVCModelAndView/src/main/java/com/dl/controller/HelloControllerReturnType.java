package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HelloControllerReturnType {
	

	@RequestMapping("/ReturnType")
	public String hello() {
		return "returntype"; // returntype.jsp
	}

}
