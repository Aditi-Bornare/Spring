package lambda;

public class Demo {

	public static void main(String[] args) {
//		System.out.println("Main Method");
		
//		First style of implementing interface
//		Test tobj=new TestImpl();
//		tobj.display();
		
//		Second style of implementing interface
//		Anonymous class
		
//		Test tobj=new Test() {
//
//			@Override
//			public void display() {
//				System.out.println("interface method implementation");
//				
//			}
//			
//		};
//		tobj.display();
//		We can write multiple anonymous class at a time
//		Test tobj1=new Test() {
//
//			@Override
//			public void display() {
//				System.out.println("interface method implementation");
//				
//			}
//			
//		};
//		tobj1.display();
//		Third style of implementing interface
//		using lambda function
		
//		Test tobj=()->{
//			
//				System.out.println("interface method implementation");
//		};
//		tobj.display();
		
//		We can write multiple lambda expression at a time
//		Test tobj1=()->{
//			
//			System.out.println("interface method 2 implementation");
//		};
//		tobj1.display();
		
//		Test tobj1=(int a,int b)->{
//			return a+b;
//		};
		
//		Test tobj1=(a,b)->{
//			return a+b;
//		};
		
//		System.out.println(tobj1.add(10, 20));
		
//		Test tobj=(String s)->{return s.length();};
		
		Test tobj=(s)->{return s.length();};
		
		System.out.println((tobj.fun("JAVA")));
	}

}
