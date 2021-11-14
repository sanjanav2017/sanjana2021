package com.demo.pojo;

public class Student {
	// properties
	
	private Integer id;
	private String studname;
	private String age;

	
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", studname=" + studname + ", age=" + age + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String studname, String age) {
		super();
		this.id = id;
		this.studname = studname;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStudname() {
		return studname;
	}
	public void setStudname(String studname) {
		this.studname = studname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

}