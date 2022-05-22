package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Car;

public class Demo 
{
	public static void main(String[] args)
	{
		
		String arr[]=new String[] {
				"resources/car.xml",
				"resources/engine.xml"
		};
		
//		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/car.xml","resources/engine.xml");
//		OR
		
		ApplicationContext ap= new ClassPathXmlApplicationContext(arr);
		
		
		Car cobj=(Car)ap.getBean("c");
		cobj.show();
	}
}
