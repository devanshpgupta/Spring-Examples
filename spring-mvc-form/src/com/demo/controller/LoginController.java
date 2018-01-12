package com.demo.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.demo.model.LoginForm;

@Controller
@RequestMapping("login")
public class LoginController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String loadLoginForm(Map model) {
		
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		
		return "loginform";
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processLogin(Map model, LoginForm loginForm, BindingResult result) {
		String view = "error";
		//System.out.println(loginForm.getUsername() + ":" + loginForm.getPassword());
		
		if(loginForm.getUsername().equals("admin")) {
			if(loginForm.getPassword().equals("admin")) {
				view = "welcome";
			}
		}
		
		return view;
	}

}
