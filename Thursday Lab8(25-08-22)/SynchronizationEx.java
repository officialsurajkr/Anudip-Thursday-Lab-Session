package lab_25_8_22;

public class SynchronizationEx 
{
	 synchronized void add(int n)
	{
		 for(int i=1;i<=5;i++)
			{
				System.out.println(n+i);
				try
				{
					Thread.sleep(400);	
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}//end of for loop
				
	}
	 
	 synchronized void sub(int n)
		{
			 for(int i=1;i<=5;i++)
				{
					System.out.println(n-i);
					try
					{
						Thread.sleep(400);	
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
				}//end of for loop
					
		}

	public static void main(String[] args) 
	{
		
		SynchronizationEx syn=new SynchronizationEx();
		//Anonymous class
				Thread t1=new Thread()
				{
					public void run()
					{
						syn.add(10);
					}
				};
				
				Thread t2=new Thread()
						{
						public void run()
						{
							syn.sub(10);
						}
						};
				
			
				t1.start();
				t2.start();
	}
	
}
