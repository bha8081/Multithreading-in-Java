public class Other_PriprityExce
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread().getPriority());

		Other_Priprity p = new Other_Priprity();
		p.start();

	}
}