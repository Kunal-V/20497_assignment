package com.sonata;

public class Employee {

	private int empId;
	String empName;
	double empSal;
	
	Employee(){}
	
	Employee (int id, String name, double sal){
		this.empId =id;
		this.empName = name;
		this.empSal = sal;
	}
	public void display() {           // display ID ,name ,salary
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSal);
	}
	
	public void salCal() {          //to calculate ,HRA, DA ,TA
		double hra = empSal/2;
		double da = (empSal*12)/100;
		double ta = (empSal*17)/100;
		System.out.println(hra);
		System.out.println(da);

		}

}