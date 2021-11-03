package com.sonata;

public class EmployeeTest {

	public static void main(String[] args) {
		Manager m=new Manager(1,"kunal",3000);
		Developer d=new Developer(2,"rao",15000);
		Tester t=new Tester(3,"raju",7000);
		m.display();
		m.salCal();
		d.display();
		d.salCal();
		t.display();
		t.salCal();
	}

}