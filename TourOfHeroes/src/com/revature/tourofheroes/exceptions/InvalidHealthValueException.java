package com.revature.tourofheroes.exceptions;

public class InvalidHealthValueException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidHealthValueException() {
		super();
	}
	
	public InvalidHealthValueException(String message) {
		super("Invalid health value input");
	}
}
