public class YieldExce
{
	public static void main(String[] args)
	{
		Yield y = new Yield();
		y.start();

		//Thread.yield(); // if you want method to stop and provide chance to other threads for execution.

		for (int i = 0; i <= 5; i++)
		{
			System.out.println(Thread.currentThread().getName()+ " - " +i);
		}
	}
}