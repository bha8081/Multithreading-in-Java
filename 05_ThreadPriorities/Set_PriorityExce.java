public class Set_PriorityExce
{
	public static void main(String[] args)
	{
		// default priorite are main 5.
		System.out.println("Main Thread priority: " +Thread.currentThread().getPriority());

		// Change the thread priorities.
		Thread.currentThread().setPriority(7);
		System.out.println("Main thread new priority: " +Thread.currentThread().getPriority());

		// Set_Priority s = new Set_Priority();
		// s.setPriority(9);
		// s.start();
	}
}