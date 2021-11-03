package com.sonata.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


	
	@Entity
	public class Student {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	long stdID;
	String stdName;
	double stdMarks;
	
	Student() {}
	Student(long id, String name, double marks){
	this.stdID=id;
	this.stdName=name;
	this.stdMarks=marks;
	}
	
	public long getStdID() {
		return stdID;
	}
	public void setStdID(long stdID) {
		this.stdID = stdID;
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
	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", stdName=" + stdName + ", stdMarks=" + stdMarks + "]";
	}
	
	
	}
	

