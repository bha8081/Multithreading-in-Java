// Check the other class priority.

public class Other_Priprity extends Thread
{
	public void run()
	{
		System.out.println("This is child thread:");
		System.out.println(Thread.currentThread().getPriority());
	}
}