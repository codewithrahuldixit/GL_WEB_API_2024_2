package com.rahul.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//@ConfigurationProperties(prefix = "student-config")
@Component

public class StudentConfig {
	/*
	private int id;
	private String name;
	private String contact;
	private String email;
*/
	@Value("${student-config.id}")
	int id;
	@Value("${student-config.name}")
	String name;
	@Value("${student-config.email}")
	String email;
	@Value("${student-config.id}")
	String contact;
	public StudentConfig() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentConfig(int id, String name, String email, String contact) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "StudentConfig [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	
	

	

}
