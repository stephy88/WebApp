package com.web.dao;

import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.web.dto.PersonDto;
import com.web.dto.PersonGetResponse;
import com.web.dto.PersonUpdateDto;
import com.web.model.Person;
import com.web.persistance.HibernateFactory;


public class PersonDaoImplement implements PersonDao{
	Logger logger = Logger.getLogger(PersonDaoImplement.class);
    SessionFactory factory = HibernateFactory.getSessionFactory();
    Session session = null;
    PersonGetResponse response = new PersonGetResponse();
	public PersonGetResponse getPersonById(Integer id) {
		logger.info("Retrieving object from database ");
		// TODO Auto-generated method stub
		session = factory.openSession();
		session.beginTransaction();
		 
		  //session.save(person);
		  session.getTransaction().commit();
		Person person = session.get(Person.class, id);
		
		return response.toPersonResponse(person); 
		
	}
	public String createPerson(PersonDto personDto) {
		logger.info("Saving begin " + personDto.toString());
		Person person = new Person();
		person.setName(personDto.getName());
                  
		session = factory.openSession();
		  session.beginTransaction();
		  session.save(person);
		  session.getTransaction().commit();
		  logger.info(personDto.getName());
		  
		  logger.info("Saveeeed");
		  return "POST radi";
		
	}
	public void updatePerson(PersonUpdateDto updateDto) {
		logger.info("update dto je " + updateDto.getName());
		session = factory.openSession();
		  session.beginTransaction();
		  Person person = session.get(Person.class, updateDto.getId());
		  logger.info(person.getName());
		  person.setName(updateDto.getName());
		  session.getTransaction().commit();
		
	}
    
	
}
