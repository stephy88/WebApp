package com.web.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonDto {
private String name;


@XmlElement
(name="name")
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
