// Create thread By using Runnable interface.
public class UsingRunnable implements Runnable
{
	// Override the run method
    public void run()
	{
		System.out.println("This is Runnable Thread:");
	}

	public static void main(String[] args)
	{
		UsingRunnable t = new UsingRunnable();

		// Create object of Thread class.And pass the refrence of UsingRunnable class in Thread.
		Thread th = new Thread(t);

		// Start the Thread.
		th.start();
	}
}