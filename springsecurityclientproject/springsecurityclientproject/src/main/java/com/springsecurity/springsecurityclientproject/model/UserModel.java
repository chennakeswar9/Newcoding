package com.springsecurity.springsecurityclientproject.model;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserModel {
	private String FirstName;
	private String LastName;
	private String Email;
	private String Password;
	private String matchingpassword;
}
