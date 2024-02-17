public class Case4_Mutli_Task_Multi_ThreadExce
{
    public static void main(String[] args)
    {
        Case4_Demo1 cd1 = new Case4_Demo1();
        cd1.start();

        Demo2 d2 = new Demo2();
        d2.start();

        Demo3 d3 = new Demo3();
        d3.start();
    }
}
