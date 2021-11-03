package com.sonata.JavaBean;

public class TestStudent {

	public static void main(String[] args) {
	Address a1 = new Address();
	a1.setCity("Bangalore");
	a1.setState("KA");
	a1.setPin(560040);
	
	Student s1 = new Student();
	s1.setStdId(123);
	s1.setStdName("kunal");
	s1.setStdMarks(55);
	s1.setObj(a1);
	System.out.println(s1);
}
}