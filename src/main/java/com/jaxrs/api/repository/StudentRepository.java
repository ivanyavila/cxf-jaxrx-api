package com.jaxrs.api.repository;

import java.util.ArrayList;
import java.util.List;

import com.jaxrs.api.model.Student;


public class StudentRepository {
	
	public static List<Student> students = new ArrayList<>();
	
	static {
		int studentsToLoad = 50;
		System.out.println("Initializing with " + studentsToLoad + " students");
		for (int i = 0; i < studentsToLoad; i++)
			students.add(new Student());
		System.out.println(studentsToLoad + " Students loaded ...");
	}
	
	public Student postStudent(String name) {
		Student newStudent = new Student(name);
		students.add(newStudent);
		return newStudent;
	}
	
	public Student getStudentById(int id){
		return students.stream()
					   .filter(s -> s.getId() == id)
					   .findFirst()
					   .orElse(null);
	}
	
	public List<Student> getAllStudents() {
		return students;
	}
	

}
