package com.sonata;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;


public class TestCriteriaQuery {

	public static void main(String[] args) {
	
		SessionFactory factory =new Configuration().configure().buildSessionFactory();
		Session s1 = factory.openSession();
		s1.beginTransaction();
		Criteria criteria = s1.createCriteria(UserDetails.class);
		
		//criteria.add(Restrictions.eq("userName", "user2"));
		
		//criteria.add(Restrictions.gt("userId" , 2));
		
		//criteria.add(Restrictions.between("userId" ,5, 8));
		
		criteria.add(Restrictions.like("userName" , "us%"));
		
		List <UserDetails> users = (List<UserDetails>)criteria.list();
		s1.getTransaction().commit();
		s1.close();
		
		for(UserDetails u : users) {
			System.out.println(u.getUserName());
			System.out.println(u.getUserId());
		
		
		
	}

}
}
