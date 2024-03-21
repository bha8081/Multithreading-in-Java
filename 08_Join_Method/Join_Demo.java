//package 08_Join_Method;

public class Join_Demo extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 0; i <= 5; i++)
            {
                System.out.println("child thread: "+i);
                Thread.sleep(2000);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
