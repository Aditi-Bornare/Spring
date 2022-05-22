//As dependecy-check has been deprecated after spring 2.0 
//we get exception, as we are using spring 5.0

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
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");		
		
		Car cobj=(Car)ap.getBean("c");
		cobj.show();
	}
}
