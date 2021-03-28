package com.hm.jpaassociations.onetoone;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Integer> {
	
	List<Person> findByName(String name);

}
