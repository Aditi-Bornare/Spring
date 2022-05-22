//To inject Collection datatype into bean class
package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test 
{
	private List fruits;
	private Set cricketers;
	private Map StCap;
	
	public void setFruits(List fruits) 
	{
		this.fruits = fruits;
	}
	
	public void setCricketers(Set cricketers) 
	{
		this.cricketers = cricketers;
	}
	
	public void setStCap(Map stCap) 
	{
		StCap = stCap;
	}
	
	public void show()
	{
		System.out.println("Fruits:");
		for(Object f:fruits)
		{
			System.out.println(f);
		}
		
		System.out.println("Cricketers:");
		for(Object c:cricketers)
		{
			System.out.println(c);
		}
		
		System.out.println("State Capitals:");
		Set keys=StCap.keySet();
		for(Object sc:keys)
		{
			System.out.println("State="+sc+" Capital="+StCap.get(sc));
		}
	}
}
