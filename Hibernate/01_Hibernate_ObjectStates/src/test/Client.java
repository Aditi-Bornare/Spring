package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] args) {
		
//		create Student class object
		Student st=new Student();
		
//		In this Student class object store data
		st.setId(111);
		st.setName("Rohit");
		st.setEmail("Rohit@gmail.com");
		st.setMarks(900);
//		Student class object state is transient
		
//		create hibernate session object
		Configuration cfg=new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
//		now open a session
		Session s=sf.openSession();
		
//		now using this session, we can move that object to persistent
		s.save(st);
//		Student class object state is persistent
		
//		Now this persistent object, we can move to permanent DB state
		s.beginTransaction().commit();
		
//		now if we want to remove object from hibernate persistent state(from session)
		s.evict(st);
//		Student class object is detached

	}

}
