package com.mahezh.student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mahezh.student.model.Student;
import com.mahezh.student.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl (StudentRepository studentRepository) {
	super();
	this.studentRepository= studentRepository;
}
	
	
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student getStudentById(long id) {
		
		return studentRepository.findById(id).orElseThrow();
	
	}


	
	
	
	

}
