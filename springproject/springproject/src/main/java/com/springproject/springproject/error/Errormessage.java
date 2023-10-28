package com.springproject.springproject.error;

import org.springframework.http.HttpStatus;



public class Errormessage {

	

	public Errormessage(HttpStatus notFound) {
		// TODO Auto-generated constructor stub
	}
	public Errormessage(HttpStatus notFound, String message2) {
		// TODO Auto-generated constructor stub
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private HttpStatus status;
	private String message;
}
