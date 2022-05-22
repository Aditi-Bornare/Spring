package beans;

public class Test 
{
	private String name;
	private int age;
	private String email;
	
	public void show()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Email is: "+email);
	}

	public Test(String name, int age, String email) 
	{
		this.name = name;
		this.age = age;
		this.email = email;
	}

}
