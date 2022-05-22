package driver;

import org.springframework.beans.factory.BeanFactory;


import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.rspc.cab.car.Car;
import com.rspc.cab.eng.Engine;


public class Demo 
{
	public static void main(String[] args)
	{
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/spring.xml");
//		Car cobj=(Car)ap.getBean("com.rspc.cab.car.Car");
//		OR
		Car cobj=(Car)ap.getBean(Car.class);
		cobj.show();
	}
}
