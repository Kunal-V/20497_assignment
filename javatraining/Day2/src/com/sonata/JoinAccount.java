package com.sonata;

public class JoinAccount  extends Bank{

	JoinAccount(){}
	JoinAccount(int a, String n, double b){
		super(a,n,b);
	}
	public void withDraw(double a) {
		super.withdraw(a);
		this.accBalance = this.Accbalance - a;
	System.out.println("withdraw" + this.accBalance);
	System.out.println("joint account");
	}
	
	public static void main(String[] args) {
		JoinAccount a1 = new JoinAccount();
		a1.accNo=123;
		a1.accName="kunal";
		a1.accBalance=3456;
		a1.withDraw(10);
	}
	
	JoinAccount a2= new JoinAccount(124,"sonata",4567);
	a2.display();
	a1.display();
	

