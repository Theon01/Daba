package com.daba.backend.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.daba.backend.domain.User;
import com.daba.backend.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	//@Autowired
	//User user;
	
	
	@RequestMapping(value="/adduser", method=RequestMethod.GET)
	String adduser(){
		
		return "adduser";
		
	}
	
	@RequestMapping(value="/adduser.do", method=RequestMethod.POST)
	String saveUser(@RequestParam String firstname,@RequestParam String lastname, @RequestParam String email, @RequestParam String password){
		
		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setEmail(email);
		user.setPassword(password);
		userService.add(user);
		return "redirect:/home";
		
		
	}
}
