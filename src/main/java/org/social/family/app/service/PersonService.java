package org.social.family.app.service;

import java.util.List;

import org.social.family.app.domain.Person;

public interface PersonService {

	List<Person> getAllPersons();

	Person createPerson(Person person);

}
