package com.org;

public class UserNotFoundException extends Exception {
	
	UserNotFoundException() {
		super("=============");
	}

	UserNotFoundException(String name) {
		super(name);
	}
}
