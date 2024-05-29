package repository;

import java.util.ArrayList;
import java.util.List;

import model.Student;


public class StudentRepository {
	
	public static List<Student> students = new ArrayList<>();
	
	static {
		int studentsToLaod = 1000000;
		System.out.println("Initializing with " + studentsToLaod + " students");
		for (int i = 0; i < studentsToLaod; i++)
			students.add(new Student());
		System.out.println(studentsToLaod + " Students loaded ...");
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
