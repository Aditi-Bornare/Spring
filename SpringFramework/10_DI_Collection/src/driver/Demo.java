package driver;

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
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");		
		
		Test cobj=(Test)ap.getBean("t");
		cobj.show();
	}
}
