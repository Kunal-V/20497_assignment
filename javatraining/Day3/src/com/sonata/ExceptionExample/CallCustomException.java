package com.sonata.ExceptionExample;

public class CallCustomException {

	public static void main(String[] args)  throws MyOwnException {
		
		int age = 10;
		if(age<18)
			throw new MyOwnException("age is less that 18");
		else 
			System.out.println("Welcome to vote");
		
	}

}
