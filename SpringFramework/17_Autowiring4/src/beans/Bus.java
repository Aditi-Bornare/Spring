//In Spring, Autowiring by AutoDetect means 
//it chooses autowire by constructor 
//if constructor is there, 
//otherwise uses autowire by type.

package beans;

public class Bus {
	private Engine engine;

	public void setEngine(Engine engine) {
		System.out.println("Autowiring by Type");
		this.engine = engine;
	}

	public Bus(Engine engine) {
		System.out.println("Autowiring by Constructor");
		this.engine = engine;
	}
	
	public void show()
	{
		System.out.println("Bus Engine Model Year: "+engine.getModelyear());
	}
}
