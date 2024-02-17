import java.util.Scanner;

public class SingleMultiThreadExce
{
	public static void main(String[] args)

	{
      	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	  	System.out.println("Eneter Your Age: ");
	  	int age = sc.nextInt();
		System.out.println(age);
	   

		SingleMultiThread th = new SingleMultiThread();
          th.start();
		//   th.run();

	}
}