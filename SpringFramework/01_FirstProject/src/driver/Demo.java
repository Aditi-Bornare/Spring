package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Demo 
{
	public static void main(String[] args)
	{
		Resource r=new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);
		Test tobj=(Test)factory.getBean("t");
		
		//Scope=singleton then only one object creation allowed
		//Scope=prototype then multiple objects are allowed
		Test tobj1=(Test)factory.getBean("t");
		Test tobj2=(Test)factory.getBean("t");
		
		tobj.fun();
	}
}
