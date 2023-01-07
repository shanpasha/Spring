package com.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@org.springframework.stereotype.Controller
public class Contro {
	
	@RequestMapping("/")
	public ModelAndView hello() {
		
		return new ModelAndView("index");
	}

	
	@RequestMapping("/hi")
	public ModelAndView he() {
		
		return new ModelAndView("helloMvc");
	}
}
