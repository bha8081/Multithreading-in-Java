// Case 4: Multiple task using Multiple thread.
public class Case4_Demo1 extends Thread
{
    public void run()
    {
        System.out.println("This is Thread 1 Task!!");
    }
}

class Demo2 extends Thread
{
    public void run()
    {
        System.out.println("This is second Thread!!");
    }
}

class Demo3 extends Thread
{
    public void run()
    {
        System.out.println("This is 3rd thread!!");
    }
}
