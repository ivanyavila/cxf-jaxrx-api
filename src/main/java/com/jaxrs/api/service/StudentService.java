package com.jaxrs.api.service;

import java.util.List;

import com.jaxrs.api.iservice.IStudentService;
import com.jaxrs.api.model.Student;
import org.springframework.stereotype.Service;
import com.jaxrs.api.repository.StudentRepository;

@Service("studentServiceBean")
public class StudentService implements IStudentService {

	private final StudentRepository studentRepository = new StudentRepository();

	@Override
	public Student postStudent(String name) {
		System.out.println("POST: Student name="+name);
		return studentRepository.postStudent(name);
	}

	@Override
	public Student getStudent(int id) {
		System.out.println("GET: Student id="+id);
		return studentRepository.getStudentById(id);
	}

	@Override
	public List<Student> getAllStudents() {
		System.out.print("GET: allStudents ");
		List<Student> students = studentRepository.getAllStudents();
		System.out.println("size = " + students.size());
		return students;
	}
}
