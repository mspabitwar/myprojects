package com.spring.security.jwt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.security.jwt.model.Student;
import com.spring.security.jwt.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/students")
	public List<Student> getUsers() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/students")
	public Student createStudent(@RequestBody Student student) {
		return studentService.createStudent(student);
	}
}