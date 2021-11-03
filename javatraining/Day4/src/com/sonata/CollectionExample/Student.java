package com.sonata.CollectionExample;

import java.util.Comparator;

public class Student Comparable<Student> {
	
	int stdID;
	String stdname;
	int stdAge;

	public Student stdId , String stdName, int stdAge) {
		
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAge = stdAge;
	}
	
	public int compareTo(Student st) {
		if(stdAge == st.stdAge)
			return 0;
		else if (stdAge > st.stdAge)
			return 1;
		else 
			return -1;
	}

	}


