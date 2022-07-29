package com.mahezh.student.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "student")

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;
	

	@NotBlank(message = "Invalid Name: Empty name")
	@NotNull(message = "Invalid Name: Name is NULL")
	@Size(min = 3, max = 30, message = "Invalid Name: Must be of 3 - 15 characters")
	
	@Column(name ="student_name")
	private String studentName;
	
	
	@NotBlank(message = "Invalid Age: Empty age")
	@NotNull(message = "Invalid Age: Age is NULL")
	@Min(value = 6, message = "Invalid Age: Equals to five or Less than five")
    @Max(value = 20, message = "Invalid Age: Exceeds 20 years")

	@Column(name = "age")
	private int   age;
	

	@NotBlank(message = "Invalid Address: Empty address")

	@Column(name = "address",  nullable = false)
	private String  address;
	


	@NotBlank(message = "Invalid Birthday: Empty Birthday")
	@NotNull(message = "Invalid Birthday: Birthday is NULL")
	
	@Column(name = "birthDay",  nullable = false)
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
