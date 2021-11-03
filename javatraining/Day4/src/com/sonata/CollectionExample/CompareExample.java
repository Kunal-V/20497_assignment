package com.sonata.CollectionExample;

import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;

public class CompareExample {

	public static void main(String[] args) {
	
		ArrayList<Student> n1 = new ArrayList<>();
		n1.add(new Student(101,"kunal", 22));
		n1.add(new Student(102,"Rao", 25));
		n1.add(new Student(101,"Micheal", 20));
		
		Collections.sort(n1);
		for(Student s : n1) {
			System.out.println(s.stdId + " " + s.stdName + " " + s.stdAge); }
	}
		
}
