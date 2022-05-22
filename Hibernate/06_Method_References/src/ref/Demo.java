package ref;

//We don't pass arguments to method references
public class Demo {

	public static void main(String[] args) {
	
//		Test tobj=()->{
//			System.out.println("implementation of show() method");
//		};
//		tobj.show();
		
//		To call static method
//		You are refering function, not calling it so don't give circular brackets
//		Test tobj1=Hello::hello;
//		tobj1.show();
		
//		To call non static method i.e. instance method
//		Hello hobj=new Hello();
//		Runnable robj= hobj::print;
//		Thread t=new Thread(robj);
//		t.start();
		
//		CAnnot pass arguments
//		Test tobj2=Hello2::hello;
//		tobj1.show();
		
		Test tobj=()->{
			return new Hello();
		};
		
		Hello hobj=tobj.show();
		hobj.display();
		
//		To call Constructor Reference
		Test tobj2=Hello::new;
		Hello hobj2=tobj2.show();
		hobj2.display();
	}
}
