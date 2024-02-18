// Demon Thread.
/*
 * Demon Thread run some other thread background.
 * It provide the service of main Thread.
 */

public class Demon_Thread extends Thread
{
	public void run()
	{
		//Using if else method.
		if (Thread.currentThread().isDaemon())
		{
			System.out.println("This is the Daemon therad: ");
		}
		else
		{
			System.out.println("This is the not a Daemon Thread: ");
		}


		System.out.println(Thread.currentThread().isDaemon());
		System.out.println("This is Run Thread:");
	}

}