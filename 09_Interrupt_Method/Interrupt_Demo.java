public class Interrupt_Demo extends Thread
{
    public void run()
    {
        try {
            for(int i = 0; i <= 8; i++)
            {
                System.out.println("Maxico");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println("Thread Interrupted :" +e);
        }
    }
}
