//Instance Factory Approach

package beans;

import org.springframework.beans.factory.FactoryBean;

public class CarFactory implements FactoryBean{
	public String carname;

	public void setCarname(String carname) {
		this.carname = carname;
	}

//	By using carname, we can create object in this method
	public Object getObject() throws Exception {
		Car cobj=(Car)Class.forName(carname).newInstance();
		return cobj;
	}

//	In this method, we are returning car type
	public Class getObjectType() {
		return Car.class;
	}
	
	
	
}
