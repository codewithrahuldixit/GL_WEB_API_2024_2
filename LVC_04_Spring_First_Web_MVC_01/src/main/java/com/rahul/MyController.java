package com.rahul;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class MyController {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello,! This Is My FIrst Web Application";
	}

	@RequestMapping("/student/{name}/{cont}")
	public Student getStudent(@PathVariable String name,@PathVariable String cont) {
		return new Student(101,name,cont);
	}
	@RequestMapping("/students")
	public List<Student> getStudents() {
		return Arrays.asList(
				new Student(101,"Rahul Dixit","9015088066"),
				new Student(102,"Shikha","12365479000"),
				new Student(103,"Atul","556859584")
				);
	}
	
	
	
}
