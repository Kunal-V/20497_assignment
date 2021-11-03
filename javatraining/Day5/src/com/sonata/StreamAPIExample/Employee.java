package com.sonata.StreamAPIExample;

public class Employee {
	
	private String empName;
	private String dept;
	private double empSal;
	
public Employee(int empId,String empName, String dept, double empSal) {
	this.empId = empId;
	this.empName = empName;
	this.dept = dept;
	this.empSal = empSal;
}

	private int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
}
