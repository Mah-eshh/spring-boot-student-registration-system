package com.mahezh.student.service;

import org.springframework.stereotype.Service;


import com.mahezh.student.model.Student;
import com.mahezh.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl (StudentRepository studentRepository) {
	this.studentRepository= studentRepository;
}
	
	
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	

	
	
	
	

}
