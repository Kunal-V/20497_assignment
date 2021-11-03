package com.sonata.JavaBean;

public class TestBean {

	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		b1.setAccNo(234);
		b1.SetAccName("kunal");
		b1.SetAccBalance(12345);
		System.out.println(b1);
	
		Employee e1 = new Employee();
		e1.setEmpid(123);
		e1.setEmpname("rao");
		e1.setEmpsal(12323);
		System.out.println(e1);
	
	
	}
	
	

}
