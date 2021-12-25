package com.mahezh.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mahezh.student.model.Student;



public interface StudentRepository extends JpaRepository<Student, Long> {

}


