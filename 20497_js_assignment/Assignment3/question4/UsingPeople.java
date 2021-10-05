package com.sonata;

public class UsingPeople {

	public static void main(String[] args) {
		Address a1=new Address("55","RR nagar","kunal","560040");
		TechnicalEmployee t1=new TechnicalEmployee(101,"rao",a1,25000,2,"c,c++");
		t1.calculateSalary();
		System.out.println(t1);
		Address a2=new Address("22","chandra layout","raju","560060");
		Staff s1=new Staff("cleaner",545,"mohan",a2,35000,5);
		s1.calculateSalary();
		System.out.println(s1);
	}

}
