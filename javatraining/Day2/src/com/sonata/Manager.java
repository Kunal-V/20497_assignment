package com.sonata;

public class Manager extends Employee {
	
	Manager(int id, String name, double sal){
		super(id, name, sal);
		}

			public void salCal()  {      // extended from employee
				super.salCal();
				double ta = (empSal*17/100);
				System.out.println(+ ta);
			}
	public static void main(String[] args) {
		Manager m1 = new Manager(121, "kunal", 20000);
		m1.salCal();
		}
}

