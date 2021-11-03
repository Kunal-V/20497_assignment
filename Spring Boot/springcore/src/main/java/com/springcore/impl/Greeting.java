package com.springcore.impl;

import org.springframework.stereotype.Component;

import com.springcore.GreetingInterface;

public class Greeting implements GreetingInterface {

	@Override
	public String sayGreeting(String name) {
		return "Hello " + name ;
	}
}
