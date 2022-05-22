package com.rspc.restAPI1;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	
	List<Student> students;
	public StudentRepository() 
	{
	
		students= new ArrayList<Student>();
		Student s1=new Student();
		s1.setId(101);
		s1.setName("Rahul");
		s1.setMarks(780);
		
		Student s2=new Student();
		s2.setId(102);
		s2.setName("Rohit");
		s2.setMarks(450);
		
		students.add(s1);
		students.add(s2);
	}
	
//	get all records
	public List<Student> getStudents()
	{
		return students;
	}

	public void create(Student stud) 
	{
		students.add(stud);
	}

	public Student getStudent(int id) 
	{
		for(Student s:students)
		{
			if(s.getId()==id)
			{
				return s;
			}
		}
		return null;
	}

}
