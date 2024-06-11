package com.jaxrs.api.model;

public class Student {
	private static int currentId=1;
	
	private int id;
	private String name;
	
	public Student() {
		super();
		this.name = "Unknown " + Student.currentId;
		this.id = Student.currentId; 
		Student.currentId++;
	}

	public Student(String name) {
		super();
		this.id = Student.currentId;
		this.name = name;
		Student.currentId++;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [ID="+ id +" name=" + name + "]";
	}

}
