package test;

import java.lang.reflect.Constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		try
		{
			Class c=Class.forName("beans.Test");
			Constructor con[]=c.getDeclaredConstructors();
			con[0].setAccessible(true);
			con[0].newInstance(null);
		}
		catch(Exception e)
		{
			
		}
	}

}
