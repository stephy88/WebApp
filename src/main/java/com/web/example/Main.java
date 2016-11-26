package com.web.example;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.web.model.Person;
import com.web.persistance.HibernateFactory;


public class Main {

	public static void main(String[] args) {
		
		  
		  Person person = new Person();
		  person.setId(2);
		  person.setName("Srdjan");
		 
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Person.class).buildSessionFactory();
		  
		  Session session = factory.openSession();
		  
		  session.beginTransaction();
		 
		  session.save(person);
		  session.getTransaction().commit();
		
		 System.out.println("Maven + Hibernate + Postgresql");
	        //Session session = HibernateFactory.getSessionFactory().openSession();
            
	        /*session.beginTransaction();
			 
			  session.save(person);
			  session.getTransaction().commit();
			  */
		   // Person p = session.get(Person.class, 1);
			  
		     
			  
			// System.out.println( p.getId());
			// System.out.println("Ime je: " + p.getName());
	}

}
