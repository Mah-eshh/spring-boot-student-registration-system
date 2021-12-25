package com.mahezh.student.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahezh.student.model.Student;
import com.mahezh.student.service.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {
	

	public StudentService studentService;
	
	public StudentController (StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//Create API to POST student details  
	@PostMapping
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		return new ResponseEntity<>(studentService.saveStudent(student), HttpStatus.CREATED);
	}
	
	
	//Create API to Retrieve (Read) all students.
	@GetMapping
	public List <Student> getAll(){
		return studentService.getAllStudents();
	}


	//The API to get specific employee by the id
	
	@GetMapping("{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentID){
		return new ResponseEntity<>(studentService.getStudentById(studentID), HttpStatus.OK);
	}
	
	
}
