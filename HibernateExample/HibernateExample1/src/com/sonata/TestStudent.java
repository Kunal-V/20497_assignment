package com.sonata;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestStudent {

	public static void main(String[] args) {
		Student std = new Student();
		std.setStdId(22);
		std.setStdName("SONATA");
		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		s1.save(std);
		s1.getTransaction().commit();
		s1.close();

	}

}
