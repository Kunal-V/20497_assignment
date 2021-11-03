package com.sonata;

public interface BankInterface {
 int abc = 30;
 public double withDraw(double amount);
 public double deposite(double amount);

default void newMethod1() {
	System.out.println("newly added default method");
	gen();
}
	default void newMethod() {
	System.out.println("newly added default method");
	gen();
}
private void myMethod( ) {
	System.out.println("Private Method");
}

	static void anotherNewMethod() {
		System.out.println("new Static Method");
	}
}



