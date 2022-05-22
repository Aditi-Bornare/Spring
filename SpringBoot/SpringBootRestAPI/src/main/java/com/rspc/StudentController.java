package com.rspc;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
//	Used for automatic dependency injection and also
//	you don't need to do = new constructor()
//	it happens automatically
	
	@Autowired
	StudentRepository repo;
	
	@GetMapping("students")
	public List<Student> getStudents()
	{
		return (List<Student>) repo.findAll();
	}
	
	@GetMapping("student/{id}")
	public Optional<Student> getStudent(@PathVariable("id") int id)
	{
		return repo.findById(id);
	}
	
	@PostMapping("student")
	public Student createStudent(@RequestBody Student s)
	{
		return repo.save(s);
	}
	
	@PutMapping("student")
	public Student updateStudent(@RequestBody Student s)
	{
		return repo.save(s);
	}
	
	@DeleteMapping("student/{id}")
	public void deleteStudent(@PathVariable("id") int id)
	{
		repo.deleteById(id);
	}
}
