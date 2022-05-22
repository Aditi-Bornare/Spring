//To inject properties dependency injection
package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test 
{
	private Properties driver;

	public void setDriver(Properties driver) {
		this.driver = driver;
	}
	
	public void show()
	{
//		Properties internally works as a map
		Set keys=driver.keySet();
		for(Object key:keys)
		{
//			getProperty() method expects argument of type String so we need to convert Object to String
//			We don't have control over sequence of the output
			System.out.println(key+" "+driver.getProperty(key.toString()));
//			Below typecasting also works instead of toString()
//			System.out.println(key+" "+driver.getProperty((String)key));
		}
	}
}
