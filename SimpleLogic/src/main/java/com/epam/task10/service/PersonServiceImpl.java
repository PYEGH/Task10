package com.epam.task10.service;

import java.util.List;

import com.epam.task10.dao.DataManager;
import com.epam.task10.dao.PersonFileDao;
import com.epam.task10.model.Person;

public class PersonServiceImpl implements PersonService {
	final private DataManager dm = new PersonFileDao();

	public List<Person> getPerson() {
		return dm.readPerson(); 
	}
	
	public String getPersonListAsText(){
		List<Person> persons = dm.readPerson();
		StringBuffer result = new StringBuffer();
		for(Person person:persons){
			result.append(person.getName());
			result.append(" ");
			result.append(person.getAge());
		}
		return result.toString();
	}
}
