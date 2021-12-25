package com.mahezh.student.service;

import java.util.List;

import com.mahezh.student.model.Student;

public interface StudentService {


	Student saveStudent(Student student);
	
	List <Student> getAllStudents();
	
	Student getStudentById(long id);
	 
	
}
