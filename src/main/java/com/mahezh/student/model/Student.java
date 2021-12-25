package com.mahezh.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name ="student_name", nullable = false)
	private String studentName;
	
	@Column(name = "age",  nullable = false)
	private int   age;
	
	@Column(name = "address",  nullable = false)
	private String  address;
	
	@Column(name = "birthday",  nullable = false)
	private String birthDay;
	
	public long getId () {
		return id;
	}
	
	public long setId(long id) {
		return this.id = id;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String setStudentName(String studentName) {
		return this.studentName= studentName;
	}
	
	public int getAge () {
		return age;
	}
	
	public int setAge(int age) {
		return this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String setAddress (String address) {
		return this.address = address;
	}
	
	
	public String getBirthDay() {
		return birthDay;
	}
	
	public String setBirthDay(String birthDay) {
		return this.birthDay= birthDay;
	}
	
	
}
