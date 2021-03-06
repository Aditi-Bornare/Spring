package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;

@Configuration
@ComponentScan(basePackages= {"com.spring.jdbc.dao"})
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource()
	{
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/dbr");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate()
	{
//		Create JdbcTemplate object
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		
//		Now set property of JdbcTemplate
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
}
