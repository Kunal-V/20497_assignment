package com.sonata.StreamAPISort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.sonata.StreamAPIExample.DataBaseEmp;
import com.sonata.StreamAPIExample.Employee;

class Mycomparator implements Comparator<Employee> {
	
	@Override
	public int compare(Employee o1, Employee o2) {
	return(int) (o1.getEmpSal() - o2.getEmpSal());

	}
}

public class SorExampleEmployee {
	
	public static void main(String[] args) {
		List<Employee> employee = DataBaseEmp.getEmployee();
		
		Collections.sort(employee, new  Mycomparator());
		System.out.println(employee);
		
		Collections.sort(employee,(o1, o2)->(int)(o1.getEmpSal() - o2.getEmpSal()));
		System.out.println(employee);
		
		employee
		.stream()
		.sorted((o1, o2)->(int) (o1.getEmpSal()-o2.getEmpSal));

	}

}
