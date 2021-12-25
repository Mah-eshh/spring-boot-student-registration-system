package com.mahezh.student.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mahezh.student.model.Student;
import com.mahezh.student.service.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {
	

	public StudentService studentService;
	public StudentController (StudentService studentService) {
		
		this.studentService = studentService;
	}
	
	//Create APi to POST student details  
	@PostMapping()
	public ResponseEntity<Student> saveStudent(Student student){
		return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
	}

	
}
