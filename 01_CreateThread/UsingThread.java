// By using Thread class.
public class UsingThread extends Thread
{
	public void run()
	{
		System.out.println("Thread is work");
	}
	public static void main(String[] args)
	{
		UsingThread t = new  UsingThread();
		
		/*
		 * Start method internali call the run() method.
		 * We are able to directly call the run() method.
		 * But a good way to always call run() method using the start() method.
		 */

		t.start();
		// t.run();
		// t.start();
	}
}