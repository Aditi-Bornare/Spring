package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public int insert(Student student) {
		
		String sql="insert into student_fullstack values(?,?,?)";
		int i=this.jdbcTemplate.update(sql,student.getId(),student.getName(),student.getCity());
		return i;
	}
	@Override
	public int updateRecord(Student student) {
		
		String sql="update student_fullstack set name=?,city=? where rollno=?";
		int i=this.jdbcTemplate.update(sql,student.getName(),student.getCity(),student.getId());
		return i;
	}
	@Override
	public int delete(int studentId) {
		String sql="delete from student_fullstack where rollno=?";
		int i=this.jdbcTemplate.update(sql,studentId);
		return i;
	}
	@Override
	public Student getStudent(int studentId) {
		String sql="select * from student_fullstack where rollno=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student std=this.jdbcTemplate.queryForObject(sql, rowMapper, studentId);
		return std;
	}
	@Override
	public List<Student> getAllStudents() {
		
		String sql="select * from student_fullstack";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		List<Student> std=this.jdbcTemplate.query(sql, rowMapper);
		
		return std;
	}

}
