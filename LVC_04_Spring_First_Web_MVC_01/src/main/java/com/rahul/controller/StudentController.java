package com.rahul.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.configuration.TrackTime;
import com.rahul.repository.Student;
import com.rahul.service.StudentService;

//@RestController
@Controller

public class StudentController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	//Browser is Capable to Send Only Get Request
	@GetMapping("/students/{id}")
	
	public String getStudent(@PathVariable int id,Model mav) {
		mav.addAttribute("student", service.getStudentById(id));
		logger.info("getSstudent() executed");
		 return "demo";
	}
	@GetMapping(path = {"/","students"})
	@TrackTime
	public String getAllStudent(Model model) {
		model.addAttribute("students", service.getAll());
		logger.info("getAllStudent() executed");
		//throw new RuntimeException("Some went Wrong");
		return "index";
	}
	@GetMapping(path = {"/addNew"})
	public String addStudent(Model model) {
		Student student = new Student();
		logger.info("AddStudent() executed");
		model.addAttribute("student", student);
		 return "addStudent";
	}
	@GetMapping(path = {"/updateStudent/{id}"})
	public String updateStudent(@PathVariable int id,Model model) {
		Student student = service.getStudentById(id);
		logger.info("updateStudent() executed");
		model.addAttribute("student", student);
		 return "addStudent";
	}
	
	
	@PostMapping("/save")
	public String setStudent(@ModelAttribute Student student) {
		System.out.println(student);
		logger.info("Save() executed");
		service.saveStudent(student);
		return "redirect:/";
	}
	@GetMapping("/deleteStudent/{id}")
	public String removeStudent(@PathVariable int id) {
		logger.info("delete() executed"); 
		service.deleteStudent(id);
		 return "redirect:/";
	}

}
