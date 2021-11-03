package com.sonata.BeanTest;

import com.sonata.ExceptionExample.MyOwnException;

public class ShowEmp {

	public static void main(String[] args) throws MyException2 { 
		
		empBusinessLogic elogic = new empBusinessLogic();
		empDetails emp = new empDetails();
		
		emp.setName("kunal");
		emp.setAge(22);
		emp.setSalary(1000);
		double appraisal = elogic.appsalary(emp);
		System.out.println(appraisal);
		
		emp.setName("rao");
		emp.setAge(20);
		emp.setSalary(5000);
		double total=elogic.yearsalary(emp);
		if(total <= 1000)
			throw new MyException2("Salary is less than described");
			else 
				System.out.println("your salary is taxable");
		System.out.println(total);
	}

}
