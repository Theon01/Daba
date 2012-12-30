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
	
	@Autowired
	User user;
	
	@RequestMapping(value="/dabaspring/adduser.do", method=RequestMethod.POST)
	String saveUser(@RequestParam String firstName,@RequestParam String lastName, @RequestParam String email, @RequestParam String password){
		
        
		this.user.setFirstName(firstName);
		this.user.setLastName(lastName);
		this.user.setEmail(email);
		this.user.setPassword(password);
		userService.add(user);
		return "redirect:/index.do";
		
		
	}
	
	@RequestMapping(value="/dabaspring/index.do", method=RequestMethod.GET)
	String index(){
		
		return "index";
		
	}
	
	@RequestMapping(value="/adduser", method=RequestMethod.GET)
	String adduser(){
		
		return "adduser";
		
	}
	
	@RequestMapping(value="/adduser.do", method=RequestMethod.POST)
	String saveUserr(@RequestParam String firstname,@RequestParam String lastname, @RequestParam String email, @RequestParam String password){
		
        
		this.user.setFirstName(firstname);
		this.user.setLastName(lastname);
		this.user.setEmail(email);
		this.user.setPassword(password);
		userService.add(user);
		return "redirect:home";
		
		
	}
	
	@RequestMapping(value="/index.do", method=RequestMethod.GET)
	String index2(){
		
			
		
		return "index";
		
		
	}

}
