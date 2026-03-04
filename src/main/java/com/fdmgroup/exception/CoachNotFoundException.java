package com.fdmgroup.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus( code = HttpStatus.NOT_FOUND)
public class CoachNotFoundException extends RuntimeException{

	public CoachNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	

}
