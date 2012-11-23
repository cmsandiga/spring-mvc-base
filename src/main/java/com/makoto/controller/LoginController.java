package com.makoto.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextCleanupListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
@RequestMapping("/login")
@Scope
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String showForm(ModelMap model){		
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(){
		return "welcome";
	}
	
	class UsuarioForm{
		private String user;
		private String password;
		public UsuarioForm(){			
		}
		public String getUser(){
			return user;
		}
		public String getPassword(){
			return password;
		}
		public void setUser(String user){
			this.user=user;		
		}
		public void setPassword(String password){
			this.password=password;
		}
	}
}
