//Instance Factory Approach

package beans;

public class CarFactory {
	public String carname;

	public void setCarname(String carname) {
		this.carname = carname;
	}
	
	public Car getCarInstance() throws Exception
	{
//		By using carname variable we can create object of Car interface
		Car cobj=(Car)Class.forName(carname).newInstance();
		return cobj;
	}
	
}
