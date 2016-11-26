package com.web.dto;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.web.model.Person;
@XmlRootElement
public class PersonGetResponse {
private int id;
private String name;

@XmlElement
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

@XmlElement
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public PersonGetResponse toPersonResponse(Person person)
{
	this.setId(person.getId());
	this.setName(person.getName());
	
	return this;
}

}
