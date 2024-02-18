// Change the thread name using the getName(), and setName().

class Demo extends Thread
{
    public void run()
    {
        // Thread.currentThread() .setName("Nitesh");

        System.out.println("This is the demo class : " +Thread.currentThread() .getName()); // Thread-0
    }
}

public class Thread_Task_Excecute {
    public static void main(String[] args)
    {
        System.out.println("Hello :" +Thread.currentThread() .getName()); // main

        // Check the thread is alive or not.
        System.out.println("Check Thread alive or not :"+ Thread.currentThread() .isAlive());

        Demo d1 = new Demo();
        d1.setName("Bhavesh");
        d1.start();

        Demo d2 = new Demo();
        d2.setName("Shubham");
        d2.start();
    }
}
