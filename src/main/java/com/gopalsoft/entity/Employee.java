package com.gopalsoft.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employee")
public class Employee {
	
	
	
	@Id
	private String id ;
	
	
	private String name;
	private String email;
	
	
	public Employee(String id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	

	public Employee( String name, String email) {
		super();
		
		this.name = name;
		this.email = email;
	}
	
	public Employee() {
		super();
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
