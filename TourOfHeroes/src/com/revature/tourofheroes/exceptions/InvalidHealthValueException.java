package com.revature.tourofheroes.exceptions;

public class InvalidHealthValueException extends Exception {

	public InvalidHealthValueException() {
		super();
	}
	
	public InvalidHealthValueException(String message) {
		super("Invalid health value input");
	}
}
