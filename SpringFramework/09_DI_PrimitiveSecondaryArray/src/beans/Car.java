//To inject primitive and secondary array
package beans;

public class Car 
{
	private String[] carnames; //primitive
	private Engine[] engine; //secondary

	
	
	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}



	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}



	public void show()
	{
		for(String car:carnames)
		{
			System.out.println(car);
		}
		for(Engine e:engine)
		{
			System.out.println(e.getModelyear());
		}
	}
}
