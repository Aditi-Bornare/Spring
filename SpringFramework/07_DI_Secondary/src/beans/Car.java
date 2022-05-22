package beans;

public class Car 
{
	private String carname; //primitive
	private Engine engine; //secondary

	public void setEngine(Engine engine) 
	{
		this.engine = engine;
	}

	public void setCarname(String carname) 
	{
		this.carname = carname;
	}
	
	public void show()
	{
		System.out.println("Carname is: "+carname);
		System.out.println("ModelYear is: "+engine.getModelyear());
	}
}
