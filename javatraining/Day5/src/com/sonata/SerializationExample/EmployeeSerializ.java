package com.sonata.SerializationExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeSerializ {

	public static void main(String[] args) throws IOException {
		
		Employee obj = new Employee(123, "Kunal", "RRnagar");
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		Employee ob = null;
		
		try {
			fos = new FileOutputStream("E:\\Employee.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
		}
		finally {
			oos.close();
			fos.close();
		}
		
		System.out.println("Serialization Done!!");
		
		FileInputStream fis = new FileInputStream("E:\\Employee.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		try {
			ob = (Employee)ois.readObject();
			ois.close();
			fis.close();
		}
	catch(ClassNotFoundException s) {System.out.println(s);}
		System.out.println("Employee ID is " + ob.getEmpId());
		System.out.println("Employee Address is " + ob.getEmpAdd());
		
		}
	}


