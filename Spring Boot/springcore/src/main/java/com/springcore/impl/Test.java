package com.springcore.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcore.GreetingInterface;
import com.springcore.TestInterface;


public class Test implements TestInterface {
	@Autowired
	GreetingInterface greeting;
	
	@Override
	public String callGreeting(String name) {
		// TODO Auto-generated method stub
		return greeting.sayGreeting(name);
	}

	public GreetingInterface getGreeting() {
		return greeting;
	}

	public void setGreeting(GreetingInterface greeting) {
		this.greeting = greeting;
	}

	
}
