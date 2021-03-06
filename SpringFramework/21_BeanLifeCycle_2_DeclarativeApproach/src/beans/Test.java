package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test {

	private String driver,url,username,password;
	private Connection con;
	
	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	As you are not implementing any interface, you can give your own
//	names to the methods, only you have to configure them in spring.xml
	
	public void myDestroy() throws Exception {
		con.close();
		System.out.println("Connection closed");
	}

	public void myInit() throws Exception {
		Class.forName(driver);
		con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection opened");
	}
	
	public void save(int id, String name, String email, String address) throws Exception{
		PreparedStatement ps=con.prepareStatement("insert into studentBeanLC values(?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, address);
		ps.executeUpdate();
		System.out.println("Data inserted successfully!!!");
	}

}
