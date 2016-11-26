package com.web.dao;

import com.web.dto.PersonDto;
import com.web.dto.PersonGetResponse;
import com.web.dto.PersonUpdateDto;
import com.web.model.Person;

public interface PersonDao {
public PersonGetResponse getPersonById(Integer id);
public String createPerson(PersonDto personDto);
public void updatePerson(PersonUpdateDto updateDto);

}
