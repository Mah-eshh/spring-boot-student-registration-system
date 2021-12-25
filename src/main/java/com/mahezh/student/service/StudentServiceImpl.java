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


	@Override
	public Student updateStudent(Student student, long id) {
		
		Student existingStudent = studentRepository.findById(id).orElseThrow();
		
		existingStudent.setStudentName(student.getStudentName());
		existingStudent.setAge(student.getAge());
		existingStudent.setAddress(student.getAddress());
		existingStudent.setBirthDay(student.getBirthDay());
		studentRepository.save(existingStudent);
		return existingStudent;
		
		
	
	}


	@Override
	public void deleteStudent(long id) {
		
		//check student exist in the database
		studentRepository.findById(id).orElseThrow();
				
		studentRepository.deleteById(id);
				
	}


	
	
	
	

}
