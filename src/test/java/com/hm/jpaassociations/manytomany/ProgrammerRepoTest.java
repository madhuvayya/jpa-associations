package com.hm.jpaassociations.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProgrammerRepoTest {

	@Autowired
	private ProgrammerRepository repo;
	
	@Test
	void testCreateProgrammer() {
		Programmer programmer = new Programmer();
		programmer.setName("Jayanth");
		
		List<Project> projects = new ArrayList<Project>();
		 
		Project proj1 = new Project();
		proj1.setName("Shopping App");
		
		Project proj2 = new Project();
		proj2.setName("Insurance App");
		
		projects.add(proj1);
		projects.add(proj2);
		
		programmer.setProjects(projects );
		repo.save(programmer);
	}
}
