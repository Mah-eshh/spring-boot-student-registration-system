package com.mahezh.student.model;

public class Student {
	
	private long id;
	
	
	private String studentName;
	private int   age;
	private String  address;
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
		return getAge();
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
	
	
	public String setBirthDay() {
		return birthDay;
	}
	
	public String getBirthDay(String birthDay) {
		return this.birthDay= birthDay;
	}
	
	
}
