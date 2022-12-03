package org.social.family.app.controller;

import java.util.List;

import org.social.family.app.domain.Person;
import org.social.family.app.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@GetMapping
	public List<Person> getAllPersons(){
		
		return personService.getAllPersons();
		
	}
	
	
	@PostMapping
	public Person addPerson(@RequestBody Person person){
		
		return personService.createPerson(person);
		
	}
	
	

}
