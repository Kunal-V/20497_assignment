package com.sonata;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	
	@Id
	private String stdName;
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
	
	
}
