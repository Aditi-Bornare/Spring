package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
//		Insert
//		Student st=new Student();
//		st.setId(110);
//		st.setName("Rohit");
//		st.setEmail("Rohit@gmail.com");
//		st.setAddress("Pune");
		
//		save() method will return primary key in serializable form
//		int pk=(Integer)s.save(st);
//		System.out.println(pk);
//		t.commit();
		
//		close session and session factory
//		s.close();
//		sf.close();
//		System.out.println("Data Inserted successfully!!!");
		
//		Update
//		Student st=new Student();
//		st.setId(222);
//		st.setName("Rohit");
//		st.setEmail("Rohit@gmail.com");
//		st.setAddress("Pune");
//		
//		s.update(st);
//		t.commit();
//		
//		s.close();
//		sf.close();
//		System.out.println("Data Updated successfully!!!");
		
//		Delete
//		Student st=new Student();
//		st.setId(222);
//		
//		s.delete(st);
//		t.commit();
//		
//		s.close();
//		sf.close();
//		System.out.println("Data deleted successfully!!!");
		
//		Select
//		Student student=s.get(Student.class,110);
		
//		If we pass pk which is not present in our DB table then get() method will return null value
//		and for that null value, we are accessing data, so we get NullPointerException
		
//		In this case if pk found then it will display record
//		If we pass non existing pk then it will only print that id and will generate error in next line
		
//		System.out.println(student.getId());
//		System.out.println(student.getName());
//		System.out.println(student.getEmail());
//		System.out.println(student.getAddress());
//		
//		s.close();
//		sf.close();
	}

}
