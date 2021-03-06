package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(JdbcConfig.class);
		
		StudentDao obj=(StudentDao)ap.getBean("studentDao");
		
		Student st=new Student();
		
//		Insert
//		st.setId(111);
//		st.setName("Harry");
//		st.setCity("Hogwarts");
//		int res=obj.insert(st);
//		System.out.println("Record inserted: "+res);

		
//		Update
//		st.setId(111);
//		st.setName("Hermoine");
//		st.setCity("Hogwarts");
//		int res=obj.updateRecord(st);
//		System.out.println("Record updated: "+res);

//		Delete
//		int res=obj.delete(111);
//		System.out.println("Record deleted: "+res);
		
//		Select query for single record
//		Student s=obj.getStudent(101);
//		System.out.println(s);
		
//		Select query for multiple records
		List<Student> s=obj.getAllStudents();
		System.out.println(s);
		
		
}

}
