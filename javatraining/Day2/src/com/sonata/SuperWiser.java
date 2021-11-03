package com.sonata;

public class SuperWiser extends Manager {
	
	SuperWiser(int id, String name, double sal){
		super(id, name, sal);
	}
		public static void main(String[] args) 
		{
		SuperWiser m1 = new SuperWiser(121, "kunal", 20000);
		m1.salCal();
	    }
}
