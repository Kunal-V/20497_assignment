package com.sonata.StreamAPIExample;

import java.util.ArrayList;
import java.util.List;

public class DataBaseEmp {
	
	public static List<Employee>getEmployee() {
		List<Employee>list = new ArrayList();
		list.add(new Employee(123, "Roshan", "IT", 5000));
		list.add(new Employee(456, "Santosh", "CIVIL", 9000));
		list.add(new Employee(789, "Bimal", "DEFENCE", 4000));
		list.add(new Employee(147, "Prakash", "SOCIAL", 7000));
		return list;
	}

}
