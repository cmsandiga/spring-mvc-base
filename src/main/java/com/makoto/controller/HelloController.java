package com.makoto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextCleanupListener;

@Controller
@RequestMapping("/welcome")
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String printHelloWorld(ModelMap model){
		
		model.addAttribute("message","Hello World Spring 3.0");
		return "hello";
	}
}
