package driver;

import java.util.Scanner;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class Demo 
{
	public static void main(String[] args) throws Exception
	{
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/spring.xml");
		cap.close();
		
//		Test1 init
//		Test2 init
//		Test2 destroy
//		Test1 destroy
		
//		The direction in which they open is the sequence in which they are written in spring.xml
//		and the direction in which they close is the sequence opposite to the sequence in which they open
		
	}
}
