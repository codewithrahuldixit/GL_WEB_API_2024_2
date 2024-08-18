package com.rahul;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	//Browser is Capable to Send Only Get Request
	@GetMapping("/students/{id}")
	public String getStudent(@PathVariable int id,Model mav) {
		mav.addAttribute("student", service.getStudentById(id));
		 return "demo";
	}
	@GetMapping(path = {"/","students"})
	public String getAllStudent(Model model) {
		model.addAttribute("students", service.getAll());
		 return "index";
	}
	@GetMapping(path = {"/addNew"})
	public String addStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		 return "addStudent";
	}
	@GetMapping(path = {"/updateStudent/{id}"})
	public String updateStudent(@PathVariable int id,Model model) {
		Student student = service.getStudentById(id);
		System.out.println(student);
		model.addAttribute("student", student);
		 return "addStudent";
	}
	
	
	@PostMapping("/save")
	public String setStudent(@ModelAttribute Student student) {
		System.out.println(student);
		service.saveStudent(student);
		return "redirect:/";
	}
	@GetMapping("/deleteStudent/{id}")
	public String removeStudent(@PathVariable int id) {
		 service.deleteStudent(id);
		 return "redirect:/";
	}

}
