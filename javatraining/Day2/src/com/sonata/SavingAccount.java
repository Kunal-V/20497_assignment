package com.sonata;

public class SavingAccount extends Bank1 implements BankInterface{
	SavingAccount() {}
	
	public double withDraw(double amount) {
		return 0;
	}
	public double deposite(double amount) {
		return 0;
	}
	

	public static void main(String[] args) {
	
	new SavingAccount();
	SavingAccount a1 = new SavingAccount();
	System.out.println(a1.abc);
	BankInterface b1 = new SavingAccount();
	System.out.println(b1.abc);
	
	b1.ewMethod();
	BankInterface.anotherNewMethod();
	System.out.println(a1.withDraw(1000));
	}
}
