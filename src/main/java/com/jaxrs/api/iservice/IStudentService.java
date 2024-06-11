package com.jaxrs.api.iservice;

import com.jaxrs.api.model.Student;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/student")
public interface IStudentService {

    @POST
    @Path("/post/{name}")
    @Produces({ MediaType.APPLICATION_JSON })
    Student postStudent(@PathParam("name") String name);

    @GET
    @Path("/get/{id}")
    @Produces({ MediaType.APPLICATION_JSON })
    Student getStudent(@PathParam("id") int id);

    @GET
    @Path("/all")
    @Produces({ MediaType.APPLICATION_JSON })
    List<Student> getAllStudents();

}
