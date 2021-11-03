package com.sonata.BeanTest;

public class empBusinessLogic implements Empinterface {

	public double yearsalary(empDetails e1) {
		double ysalary = 0;
		ysalary = e1.getSalary()*12;
		return ysalary;
	}
	public double appsalary(empDetails e1) {
		double appraisal = 0;
		
		if(e1.getSalary()<10000) {
			appraisal = 5000;
		} else {
			appraisal = 1000;
		}
			return appraisal;
	}
	
}
