//package 08_Join_Method;
import java.util.*;

public class Join_DemoExce
{
    public static void main(String[] args) throws InterruptedException
    {
        Join_Demo jd = new Join_Demo();
        jd.start();

        jd.join();

        try
        {
            for(int i = 0; i <= 5; i++)
            {
                System.out.println("Main Thread : " +i);
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }    
}
