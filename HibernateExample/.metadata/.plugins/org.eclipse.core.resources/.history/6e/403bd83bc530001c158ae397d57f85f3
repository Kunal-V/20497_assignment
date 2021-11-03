package com.sonata;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class TestInheritance {

	public static void main(String[] args) {
		Project p1 = new Project();
		p1.setProjectName("Hibernate Lessons");
		
		Module m1 = new Module();
		m1.setModuleName("Spring Lessons");
		m1.setProjectName("AOP");
		
		Task t1 =  new Task();
		t1.setProjectName("java Lessons");
		t1.setModuleName("Collections");
		t1.setTaskName("ArrayList");
		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.save(m1);
		s1.save(t1);
		s1.getTransaction().commit();

	}

}
