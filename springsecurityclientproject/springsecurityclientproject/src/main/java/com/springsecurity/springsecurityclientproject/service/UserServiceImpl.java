package com.springsecurity.springsecurityclientproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.springsecurity.springsecurityclientproject.entity.User;
import com.springsecurity.springsecurityclientproject.model.UserModel;
import com.springsecurity.springsecurityclientproject.respository.UserRespository;
import com.springsecurity.springsecurityclientproject.verficationtoken.VerficationToken;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRespository userRespository;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public User registerUser(UserModel userModel) {
		// TODO Auto-generated method stub
		
		User user = new User();
		user.setEmail(userModel.getEmail());
		user.setFirstName(userModel.getFirstName());
		user.setLastName(userModel.getLastName());
		user.setRole("USER");
		user.setPassword(passwordEncoder.encode(userModel.getPassword()));
		
		userRespository.save(user);
		return user;
	}

	@Override
	public void saveVerficationTokenForUser(String token, org.apache.catalina.User user) {
		// TODO Auto-generated method stub
		VerficationToken verficationToken=new VerficationToken(user, token);
	}

}
