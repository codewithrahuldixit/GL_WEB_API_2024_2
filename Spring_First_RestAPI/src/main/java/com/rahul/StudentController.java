package com.rahul;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@RestController
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	//Browser is Capable to Send Only Get Request
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		return service.getStudentById(id);
	}
	@GetMapping("/students")
	public List<Student> getAllStudent() {
		return service.getAll();
	}
	@PostMapping("/student")
	public void setStudent(@RequestBody Student student) {
		service.saveStudent(student);
	}
	@DeleteMapping("/students/{id}")
	public void removeStudent(@PathVariable int id) {
		 service.deleteStudent(id);
	}

}
