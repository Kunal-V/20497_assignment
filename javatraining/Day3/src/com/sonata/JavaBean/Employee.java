package com.sonata.JavaBean;

public class Employee {
	
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	private class Employee1
	{
		private int empid;
		private String empName;
		private double empsal;
		
		public int getEmpid() {
			return empid;
		}
		public void setEmpid(int empid) {
			this.empid = empid;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public double getEmpsal() {
			return empsal;
		}
		public void setEmpsal(double empsal) {
			this.empsal = empsal;
		}
		
	}

	public void setEmpid(String string) {
		// TODO Auto-generated method stub
		
	}

}
