package driver;

import java.util.Calendar;

import org.springframework.beans.factory.BeanFactory;



import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;


public class Demo 
{
	public static void main(String[] args)
	{
//		You cannot class private constructor like below
//		Test tobj2=new Test();
		
//		but Spring can call private constructor
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");
		Test tobj=(Test)ap.getBean("t");
		
//		Calendar is an abstract class so you cannot do the below
//		Calendar cobj= new Calendar();
		
//		Spring framwork can create object of abstract class by using
//		factory-method="getInstance" in spring.xml
		Calendar cobj=(Calendar)ap.getBean("c");
		System.out.println(cobj.getCalendarType());
//		In the above case Calendar class is factory class
		
	}
}
