package com.hm.jpaassociations.onetoone;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToOneTest {

	@Autowired
	private PersonRepository repo;
	
	@Autowired
	private LicenseRepository liceRepo;
	
	@Test
	void testCreatePerson() {
		Person person = new Person();
		
		person.setName("Tharun");
		repo.save(person);
		
		Person person1 = repo.findByName("Tharun").get(0);
		
		License license = new License();
		license.setType("Two wheelar");
		license.setPerson(person1);
		
		liceRepo.save(license);
	}
	
}
