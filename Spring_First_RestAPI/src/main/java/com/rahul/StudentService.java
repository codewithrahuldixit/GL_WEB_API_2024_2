package com.rahul;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private static int id =100;
	private StudentRepository repository;
	
	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
		repository.save(new Student(id++,"Rahul","9015088066"));
		repository.save(new Student(id++,"Shikha","9876543210"));
		repository.save(new Student(id++,"Atul","0123456789"));
		repository.save(new Student(id++,"Vimlesh","95147863210"));
		
	}

	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	public List<Student> getAll() {
		
		return repository.findAll();
	}

	public void saveStudent(Student student) {
		student.setId(id);
		repository.save(student);
	}

	public void deleteStudent(int id2) {
		// TODO Auto-generated method stub
		repository.deleteById(id2);
	}

	
}
