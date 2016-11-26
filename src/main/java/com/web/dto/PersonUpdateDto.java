package com.web.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonUpdateDto {
private Integer id;
private String name;

@XmlElement
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

@XmlElement
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


}
