package controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import model.Student;
import repository.StudentRepository;

@Path("/student")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class StudentController {
	
    private StudentRepository studentRepository = new StudentRepository();

	@POST
	@Path("/add/{name}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
	public Student postStudent(@PathParam("name") String name) {
		System.out.println("POST: Student name="+name);
		return studentRepository.postStudent(name);
	}
	
	@GET
	@Path("/id/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
	public Student postStudent(@PathParam("id") int id) {
		System.out.println("GET: Student id="+id);
		return studentRepository.getStudentById(id);
	}
    
    
	@GET
	@Path("/all")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
	public List<Student> getAllStudents() {
		System.out.print("GET: allStudents ");
		List<Student> students = studentRepository.getAllStudents();
		System.out.println("size = " + students.size());
		return students;
	}
}
