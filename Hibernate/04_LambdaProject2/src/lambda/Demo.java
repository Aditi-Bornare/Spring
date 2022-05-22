package lambda;

public class Demo {

	public static void main(String[] args) {
	
		Runnable thread1=()->{
//			Thread body
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		Thread t =new Thread(thread1);
		t.start();
		
//		Multithreading
		Runnable thread2=()->{
//			Thread body
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				try
				{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		};
		Thread t1 =new Thread(thread2);
		t1.start();
	}
}
