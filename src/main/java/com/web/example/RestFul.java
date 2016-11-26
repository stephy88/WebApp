package com.web.example;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.web.dao.PersonDao;
import com.web.dao.PersonDaoImplement;
import com.web.dto.PersonDto;
import com.web.dto.PersonGetResponse;
import com.web.dto.PersonUpdateDto;
import com.web.model.Person;

@Path("/person")
public class RestFul {
    
	PersonDao personDao = new PersonDaoImplement();
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("{id}")
	public PersonGetResponse getPerson(@PathParam("id") Integer id)
	{
		PersonGetResponse person = personDao.getPersonById(id);
		return person;
	}
	
	@POST
	public String createPerson(PersonDto personDto)
	{
	   String s = personDao.createPerson(personDto);
	   
	   return s;
	}
	
	@PUT

	public void updatePerson(PersonUpdateDto updateDto)
	{
		personDao.updatePerson(updateDto);
	}
}
