package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		
		JdbcTemplate template=(JdbcTemplate)ap.getBean("jdbcTemplate");
		
//		Insert query
		String sql="insert into student_fullstack values(?,?,?)";
		
//		Fire desired query
		int res = template.update(sql,101,"Dummy","Dummy");
		
		System.out.println("Record inserted: "+res);
	}

}
