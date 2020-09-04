package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@CrossOrigin
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	
	//add student
	@PostMapping("/students/addnew")
	public void addStudent(@RequestBody Student student) {
		studentservice.AddStudent(student);
	}
	
	//edit student
	@PutMapping("/students/{id}/edit")
	public void editStudent(@PathVariable("Id")int id,@RequestBody Student student) {
		studentservice.EditStudent(student);
	}
	
	//delete student
	@DeleteMapping("/students/{id}/delete")
	public void deleteStudent(@PathVariable("id")int id) {
		studentservice.deleteStudentById(id);
	}
	
	//return all students
	@GetMapping("/students")
	public List<Student> returnAllStudents(){
		return studentservice.getAllStudents();
	}
	
}
