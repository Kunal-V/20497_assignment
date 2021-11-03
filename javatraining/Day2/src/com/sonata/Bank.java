package com.sonata;

public class Bank {
	int accNo = 789;
	String accName;
	double Accbalance = 456;
	
	static {
		System.out.println("show the static block");
	}
	
	Bank(){}
	Bank(int no, String anem, double bal) {
		this.accNo =no;
		this.accName=name;
		this.Accbalance=bal;
	}
	
	public void deposit(double b) {
		this.Accbalance = this.Accbalance + b;
		System.out.println("bank deposit" + accBalance);
	}
	
	public void withDraw(double a) {
	
		this.Accbalance = this.Accbalance - a;
		System.out.println("Bank withdraw");
	
	}
	public void display() {
		System.out.println("accNo");
		System.out.println("accName");
		System.out.println("accBalance");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
