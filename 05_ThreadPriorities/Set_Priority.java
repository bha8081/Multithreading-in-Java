// Set Priority.
/*
 * JVM provides the prioritie to each Thread & according to these priorites JVM, allocate the processor.
 * Priorites are represented in the form of integer value.
 * Range of the priorites are 1 - 10.
 *  1 is MIN_PRIORITY
 *  5 is NORM_PRIORITY
 *  10 is MAX_PRIORITY
 * 
 * Window does not the Thread Priorities.
 */

public class Set_Priority extends Thread
{
	public void run()
	{
		System.out.println("child Thread: ");

		System.out.println("Child thread priority: " +Thread.currentThread().getPriority());
	}
}