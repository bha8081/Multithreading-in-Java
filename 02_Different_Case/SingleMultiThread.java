// 2. performing single task from multiple thread.

public class SingleMultiThread extends Thread
{
	int age;

	public void run()
	{
		if (age >= 18)
		{
			System.out.println("You are the eligible to the Vote: ");
		}
		else {
			System.out.println("You are not eligible to Vote: ");
		}

		System.out.println("Sorry you are not allow:");

	}
}