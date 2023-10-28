package com.springproject.springproject.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {

//	@RequestMapping(value = "/" , method = RequestMethod.GET)
	@Value("$(welcome.message)")
	private String welcomemessage;
	
	@GetMapping("/")
	public String helloworld()
	{
		return welcomemessage;
	}
}
