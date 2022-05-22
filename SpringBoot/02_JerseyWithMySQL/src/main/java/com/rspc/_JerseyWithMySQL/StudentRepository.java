package com.rspc._JerseyWithMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
	
	Connection con;
	public StudentRepository() 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbr","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
//	get all records
	public List<Student> getStudents()
	{
		String sql="select * from studentjersey";
		List<Student> students= new ArrayList<Student>();
		try
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
				Student s=new Student();
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setMarks(rs.getInt(3));
				students.add(s);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return students;
	}
	
	public void create(Student stud)
	{
		String sql="insert into studentjersey values(?,?,?)";
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, stud.getId());
			ps.setString(2, stud.getName());
			ps.setInt(3, stud.getMarks());
			ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public Student getStudent(int id) 
	{
		String sql="select * from studentjersey where id="+id;
		Student s=new Student();
		try
		{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
			{
				s.setId(rs.getInt(1));
				s.setName(rs.getString(2));
				s.setMarks(rs.getInt(3));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return s;
	}

	public void update(Student stud) 
	{
		String sql="update studentjersey set name=?,marks=? where id=?";
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, stud.getName());
			ps.setInt(2, stud.getMarks());
			ps.setInt(3, stud.getId());
			ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void delete(int id) 
	{
		String sql="delete from studentjersey where id=?";
		try
		{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
