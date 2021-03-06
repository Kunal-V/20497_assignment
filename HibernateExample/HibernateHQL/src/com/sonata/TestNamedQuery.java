package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class TestNamedQuery {

	public static void main(String[] args) {
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		Query query = s1.getNamedQuery("getUserDetails.byId");
		query.setInteger(0, 4);
		//Query query = s1.getNamedQuery("getUserDetails.byName");
		
		List <UserDetails> users = (List<UserDetails>)query.list();
		s1.getTransaction().commit();
		s1.close();
		
		for(UserDetails u : users) {
			System.out.println(u.getUserName());
	
	}
	}
}
