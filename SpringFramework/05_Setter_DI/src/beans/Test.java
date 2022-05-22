package beans;

//public class Test 
//{
//	private String gender;
//	//gender is property name in spring.xml
//	public void setGender(String gender) 
//	{
//		this.gender = gender;
//	}
//	
//	public void fun(String name)
//	{
//		System.out.println("Hello "+gender+" "+name);
//	}
//}

public class Test 
{
	private String name;
	public void setName(String name, String email) 
	{
		this.name = name;
	}
	
	public void fun()
	{
		System.out.println("Hello "+name);
	}
}
