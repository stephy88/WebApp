package com.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.web.dto.PersonDto;
import com.web.dto.PersonGetResponse;

@Entity
@Table(name = "bzvz")
public class Person {
    
	public Person() {
	}
	
    @Id
    @GeneratedValue
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "name")
    private String name;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
