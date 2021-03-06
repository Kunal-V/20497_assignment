package com.sonata;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class TestHQLShowAll {

	public static void main(String[] args) {
	
		UserDetails user = new UserDetails();
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		
		Query query = s1.createQuery("from UserDetails where userId = ? and userName = ?" );
		query.setInteger(0, 5);
		query.setString(1, "user5");
		List <UserDetails> users = (List<UserDetails>)query.list();
		s1.getTransaction().commit();
		s1.close();
		
		for(UserDetails u : users) {
			System.out.println(u.getUserName());
			System.out.println(u.getUserId());
		}

	}

}
