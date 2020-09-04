package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepository;
	
	public void AddStudent(Student student) {
		studentrepository.save(student);
	}
    public void EditStudent(Student student) {
		studentrepository.save(student);
	}
	public void deleteStudentById(int id) {
		studentrepository.deleteById(id);
	}
	public List<Student> getAllStudents(){
		return studentrepository.findAll();
	}
	public Student getStudentById(int id) {
		return studentrepository.findById(id);
	}

}
