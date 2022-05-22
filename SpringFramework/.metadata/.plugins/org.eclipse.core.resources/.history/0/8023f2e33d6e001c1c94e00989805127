package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	@Autowired
	@Qualifier(value="e2")
	private Engine engine; //secondary datatype
	
	public void show()
	{
		System.out.println(engine.getModelyear());
	}
	
}
