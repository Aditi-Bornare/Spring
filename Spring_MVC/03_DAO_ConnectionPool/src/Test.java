import java.sql.Connection;
import java.util.Date;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class Test {

	public static void main(String[] args) 
	{
		BasicDataSource bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("system");
		bds.setMaxTotal(15);
		bds.setMaxIdle(5);
		bds.setMaxWaitMillis(1000*5);
		
		Date d1=new Date();
		System.out.println("Connection Pool");
		for(int i=1;i<=20;i++)
//		for(int i=1;i<=200000;i++)
		{
			try
			{
				Connection con=bds.getConnection();
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
