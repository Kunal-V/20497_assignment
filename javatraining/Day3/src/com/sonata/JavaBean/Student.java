package com.sonata.JavaBean;

public class Student {
	
	public String toString() {
		return "Student [stdName=" + stdName + ", stdMarks=" + stdMarks + ", obj=" + obj + ", stdId=" + stdId
				+ ", getStdId()=" + getStdId() + ", getStdName()=" + getStdName() + ", getStdMarks()=" + getStdMarks()
				+ ", getObj()=" + getObj() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	private String stdName;
	private double stdMarks;
	Address obj;

	private int stdId;
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public double getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(double stdMarks) {
		this.stdMarks = stdMarks;
	}
	public Address getObj() {
		return obj;
	}
	public void setObj(Address obj) {
		this.obj = obj;
	}
	
	
	
}
