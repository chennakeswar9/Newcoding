package com.springsecurity.springsecurityclientproject.event;

import org.springframework.context.ApplicationEvent;

import com.springsecurity.springsecurityclientproject.entity.User;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RegisrationCompleteEvent extends ApplicationEvent{
	
	private User user;
	private String applicationUrl;

	public RegisrationCompleteEvent(User user, String applicatonUrl) {
		super(user);
		this.user=user;
		this.applicationUrl=applicatonUrl;
		// TODO Auto-generated constructor stub
	}

}
