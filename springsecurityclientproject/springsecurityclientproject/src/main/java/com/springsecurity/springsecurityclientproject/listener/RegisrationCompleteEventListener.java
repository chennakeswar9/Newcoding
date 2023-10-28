package com.springsecurity.springsecurityclientproject.listener;

import java.util.UUID;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;


import com.springsecurity.springsecurityclientproject.event.RegisrationCompleteEvent;
import com.springsecurity.springsecurityclientproject.service.UserService;

public class RegisrationCompleteEventListener implements  ApplicationListener<RegisrationCompleteEvent> {
	@Autowired
	private UserService userService;
	
	@Override
	public void onApplicationEvent(RegisrationCompleteEvent event) {
		// TODO Auto-generated method stub
		User user = event.getUser();
		String token = UUID.randomUUID().toString();
		userService.saveVerficationTokenForUser(token,user);
	}

}
