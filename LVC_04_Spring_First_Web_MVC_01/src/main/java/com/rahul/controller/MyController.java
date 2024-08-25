package com.rahul.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.configuration.StudentConfig;
import com.rahul.repository.Student;

@RestController

public class MyController {
	
	@Autowired
	private StudentConfig config;

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello,! This Is My FIrst Web Application";
	}

	//@RequestMapping("/student/{name}/{cont}")
	public Student getStudent(@PathVariable String name,@PathVariable String cont) {
		return new Student(101,name,cont);
	}
	//@RequestMapping("/students")
	public List<Student> getStudents() {
		return Arrays.asList(
				new Student(101,"Rahul Dixit","9015088066"),
				new Student(102,"Shikha","12365479000"),
				new Student(103,"Atul","556859584")
				);
	}
	@RequestMapping("/studentconfig")
	public StudentConfig getConfig() {
		return config;
	}
	
	
	
}
