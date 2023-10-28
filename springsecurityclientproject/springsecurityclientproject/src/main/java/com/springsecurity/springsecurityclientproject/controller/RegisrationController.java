package com.springsecurity.springsecurityclientproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springsecurity.springsecurityclientproject.entity.User;
import com.springsecurity.springsecurityclientproject.event.RegisrationCompleteEvent;
import com.springsecurity.springsecurityclientproject.model.UserModel;
import com.springsecurity.springsecurityclientproject.service.UserService;


@RestController
public class RegisrationController {
	@Autowired
	private UserService userService;
	@Autowired
	private ApplicationEventPublisher publisher;
	
	@PostMapping("/register")
	public String regisrationUser(@RequestBody UserModel usermodel)
	{
		
		User user = userService.registerUser(usermodel);
		publisher.publishEvent(new RegisrationCompleteEvent(user,"url"));
		
		
		
		return "Succes";
		
	}

}
