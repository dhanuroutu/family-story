package org.social.family.app.service;

import java.util.List;

import org.social.family.app.domain.Person;
import org.social.family.app.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonRepository personRepository;

	@Override
	public List<Person> getAllPersons() {
		return personRepository.findAll();
	}
	
	
	@Override
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}

}
