package beans;

//public class Test 
//{
//	private String name;
//
//	public Test(String name) 
//	{
//		this.name=name;
//	}
//	
//	public void show()
//	{
//		System.out.println("Hello "+name);
//	}
//}

public class Test 
{
	private String name;
	private int age;
	
//	public Test(int age) 
//	{
//		this.age = age;
//	}
//
//	public Test(String name) 
//	{
//		this.name=name;
//	}
	
	public void show()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
	}

	public Test(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
}
