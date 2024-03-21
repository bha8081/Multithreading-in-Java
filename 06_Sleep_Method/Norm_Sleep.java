// Normal method sleep().
// We are try to provide the InterruptedException other wise directly provide Exception.

public class Norm_Sleep
{
	public static void main(String[] args) throws Exception
	{
		for (int i = 0; i <= 10; i++)
		{
			Thread.sleep(1000);
			System.out.println("Bhavesh");
		}
	}
}