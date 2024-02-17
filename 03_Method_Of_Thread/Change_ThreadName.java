// Change the Thread Name.
public class Change_ThreadName
{
    public static void main(String[] args)
    {
        // Current working Thread Name.
        System.out.println("Current Working Thread : "+Thread.currentThread() .getName());

        // After changing thread name.
        Thread.currentThread().setName("Bhavesh");
        System.out.println("New Changing Thread Name : "+Thread.currentThread() .getName());

        // give the error in change thread name.
        // System.out.println(10/0);
    }
}
