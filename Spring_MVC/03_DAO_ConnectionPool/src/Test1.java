import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Test1 {

	public static void main(String[] args) 
	{
		System.out.println("JDBC Connection from DB");
		
		Date d1=new Date();
		System.out.println("Connection Pool");
//		for(int i=1;i<=20;i++)
		for(int i=1;i<=20000;i++)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
				System.out.println(con+":"+i);
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		Date d2=new Date();
		System.out.println("Start Time: "+d1);
		System.out.println("End Time: "+d2);
	}

}
