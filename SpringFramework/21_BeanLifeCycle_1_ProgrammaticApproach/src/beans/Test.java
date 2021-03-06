package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {

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

	@Override
//	Disposable Bean Method
//	Works as destroy() in servlet
	public void destroy() throws Exception {
		con.close();
		System.out.println("Connection closed");
	}

	@Override
//	Initialising Bean Method
//	Works as init() in servlet
	public void afterPropertiesSet() throws Exception {
		Class.forName(driver);
		con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection opened");
	}
	
//	As the interfaces do not have service() method, we write our own
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
