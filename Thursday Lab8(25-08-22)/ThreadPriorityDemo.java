package lab_25_8_22;

public class ThreadPriorityDemo extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
//			try
//			{
//				Thread.sleep(100);
//			}
//			catch(InterruptedException e)
//			{
//				System.out.println(e.getMessage());
//			}
			
		
			
			System.out.println(Thread.currentThread().getName()+
					" Priority "+Thread.currentThread().getPriority());
		}
	}
	
	public static void main(String[] args)
	{
		ThreadPriorityDemo tp=new ThreadPriorityDemo();
		Thread t1=new Thread(tp);
		Thread t2=new Thread(tp);
		Thread t3=new Thread(tp);
//		
		t1.setName("First-Thead");
		t2.setName("Second Name");
		t3.setName("Third-Thread");
//		
		t1.setPriority(10); //max
		t2.setPriority(5); //norm
		t3.setPriority(1); //min
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
