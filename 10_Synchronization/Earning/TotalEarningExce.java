public class TotalEarningExce
{
    public static void main(String[] args) throws InterruptedException
    {
        TotalEarning te = new TotalEarning();
        te.start();

        // System.out.println("Total earnings : "+te.total+" Rs");

        synchronized(te)
        {
            te.wait();
            System.out.println("Total earning : "+te.total+" Rs");
        }
    }
}