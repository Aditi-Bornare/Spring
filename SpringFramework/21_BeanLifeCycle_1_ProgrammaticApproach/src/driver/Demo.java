package driver;




import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;



public class Demo 
{
	public static void main(String[] args) throws Exception
	{
		ConfigurableApplicationContext cap=new ClassPathXmlApplicationContext("resources/spring.xml");
		int i=1;
		while(i==1)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter 1 for Save, 2 for Close");
			i=sc.nextInt();
			switch(i)
			{
			case 1:
				Test t=(Test)cap.getBean("t");
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter email");
				String email=sc.next();
				System.out.println("Enter address");
				String address=sc.next();
				t.save(id, name, email, address);
				
				break;
			default:
				cap.close();
				break;
			}
		}
	}
}
