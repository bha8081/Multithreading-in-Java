public class Demon_ThreadExce {
    public static void main(String[] args)
	{
		
		System.out.println("This is the main thread : " +Thread.currentThread() .getName());

		Demon_Thread t = new Demon_Thread();

		// Demon thread always create the before the start method.
		t.setDaemon(true);
		t.start();

		// After the start method create Demon thread it is gives the error, IlligalThreadStateException.
		//t.setDaemon(true); // Throws Excxeption = Exception throws in "main" thread java.lang.IllegalThreadStateException. 
	}
}
