package com.rspc.restAPI1;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("students")
public class StudentResource {
	
	StudentRepository repo=new StudentRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudents()
	{
		return repo.getStudents();
	}
	
	@GET
	@Path("student/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(@PathParam("id") int id)
	{
		return repo.getStudent(id);
	}
	
	@POST
	@Path("student")
	@Produces(MediaType.APPLICATION_JSON)
	public Student createStudent(Student stud)
	{
		repo.create(stud);
		return stud;
	}
}
