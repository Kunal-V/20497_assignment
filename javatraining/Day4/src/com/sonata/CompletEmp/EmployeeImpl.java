package com.sonata.CompletEmp;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class EmployeeImpl implements EmployeeInt {
	List<Employee> l1 = new LinkedList<>();
	
	@Override
	public void addEmployee(Employee o) {
		l1.add(o);
	}
	
	@Override
	public List<Employee> getEmployee() {
		return l1;
	}
	
	@Override
	public void removeEmployee(Employee o) {

	
	}

}
