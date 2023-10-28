package com.springsecurity.springsecurityclientproject.service;

import com.springsecurity.springsecurityclientproject.entity.User;
import com.springsecurity.springsecurityclientproject.model.UserModel;

public interface UserService {

	User registerUser(UserModel usermodel);

	void saveVerficationTokenForUser(String token, org.apache.catalina.User user);

}
