package com.sonata.one;

public class Bank {
	int accNo;
	String accName;
	double balance;
	
	public void deposit() {
		System.out.println("Deposit");
	}	
	
	public void withdraw() {
		System.out.println("withdraw");
	}	
	
	public void display() {
		System.out.println("accNo");
	}
	
	
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.deposit();
		b1.display();
		
		Bank b2 = new Bank();
		b2.accNo = 345;
		b2.deposit();
		b2.display();
	}

}
