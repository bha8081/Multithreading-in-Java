// yield method.

public class Yield extends Thread
{
	public void run()
	{
		Thread.yield();
		for (int i = 0; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " - " +i);
		}
		
	}
}