package com.hm.jpaassociations.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@ManyToMany(mappedBy = "projects")
	private List<Programmer> programmers;
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Programmer> getProgrammers() {
		return programmers;
	}

	public void setProgrammers(List<Programmer> programmers) {
		this.programmers = programmers;
	}

}
