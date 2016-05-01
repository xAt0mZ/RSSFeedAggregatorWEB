package com.rssfeedaggregator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rssfeedaggregator.api.UserAPI;
import com.rssfeedaggregator.entities.User;
 
@Controller
public class AuthController {
 
	@RequestMapping("/login")
	public ModelAndView login() {
 
		ModelAndView mv = new ModelAndView("login");
		
		User user = new User();
		user.email = "baron_l@epitech.eu";
		user.password = "password";
		
		user = UserAPI.login(user);
		
		mv.addObject("user", user);
		return mv;
	}
}
