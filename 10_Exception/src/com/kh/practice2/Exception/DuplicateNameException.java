package com.kh.practice2.Exception;

public class DuplicateNameException extends Exception{
	
	public DuplicateNameException() {
		
		this("This is DuplicateNameException...");
		
	}
	
	public DuplicateNameException(String message) {
		super(message);
	}
	
	
}
