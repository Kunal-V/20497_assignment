package com.sonata;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestLifeCycle {

	public static void main(String[] args) {
	
		//Transient
		UserObject u1 = new UserObject();
		u1.setUserName("abc");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		//persisted
		u1.setUserName("updated user");
		s1.save(u1);
		
		u1.setUserName("updated user1");
		s1.getTransaction();
		s1.close();
		//detached
		u1.setUserName("updated user2");
		s1.close();
		
	}

}
