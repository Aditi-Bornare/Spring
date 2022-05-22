//To inject particular Collection class  datatype into bean class
package beans;

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test 
{
	private Vector fruits;
	private TreeSet cricketers;
	private Hashtable StCap;
	
	public void setFruits(Vector fruits) 
	{
		this.fruits = fruits;
	}

	public void setCricketers(TreeSet cricketers) 
	{
		this.cricketers = cricketers;
	}

	public void setStCap(Hashtable stCap) 
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
