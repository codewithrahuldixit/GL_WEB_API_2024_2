package com.rahul;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	//private static int id =105;
	private StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public List<Student> getAll() {
		
		return repository.findAll();
	}

	public void saveStudent(Student student) {
		//student.setId(id);
		repository.save(student);
	}

	public void deleteStudent(int id2) {
		// TODO Auto-generated method stub
		repository.deleteById(id2);
	}

	
}
