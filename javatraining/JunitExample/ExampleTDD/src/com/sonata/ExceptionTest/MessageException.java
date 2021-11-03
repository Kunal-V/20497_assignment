package com.sonata.ExceptionTest;

public class MessageException {

	private String message;
	public MessageException(String message) {
		this.message = message;
		
	}
	
	public void printMessage() {
		int x[]= {1};
		System.out.println(x[2]);
		
	}
	
	public String addMessage() {
		message = "hi" + message;
		System.out.println(message);
		return message;
	}
}
