//Static Factory Approach

package beans;

public class CarFactory {
	public static String carname;

	public static void setCarname(String carname) {
		CarFactory.carname = carname;
	}
	
	//static factory approach
	public static Car getCarInstance() throws Exception
	{
//		By using carname variable we can create object of Car interface
		Car cobj=(Car)Class.forName(carname).newInstance();
		return cobj;
	}
	
}
