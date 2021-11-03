package com.sonata.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.employee.impl.EmployeeImpl;
import com.sonata.model.Employee;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeImpl empService;
	
	@GetMapping(value="/emp")
	public List<Employee> getEmp() {
		return empService.getAllEmployee();
	}

}
