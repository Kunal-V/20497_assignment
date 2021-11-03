package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSchool {

	public static void main(String[] args) {

		School_Details s1 = new School_Details();
		s1.setPublic(true);
		s1.setSchoolAddress("Bangalore");
		s1.setStudentCount(20);
		
		School e1 = new School();
		e1.setSchDetails(s1);
		e1.setSchoolName("New Horizon");
		
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session sess = factory.openSession();
		sess.beginTransaction();
		sess.save(e1);
		sess.getTransaction();
		sess.close();
	}

}
