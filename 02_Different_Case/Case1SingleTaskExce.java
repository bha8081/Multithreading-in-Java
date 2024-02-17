public class Case1SingleTaskExce
{
	public void show()
	{
		System.out.println("This is the Exce fiel");
	}
  public static void main(String[] args)
	{
		// int a, b, c;
		// a = 40;
		// b = 30;
		// c = a + b;
		// System.out.println(c);

		Case1SingleTaskExce t = new Case1SingleTaskExce();

		Case1SingleTask cst = new Case1SingleTask();

		cst.start();
		t.show();
	}
}