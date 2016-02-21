package com.epam.task10.service;

import java.util.List;

import com.epam.task10.model.Person;

public interface PersonService {

	List<Person> getPerson();

	String getPersonListAsText(); 
}
