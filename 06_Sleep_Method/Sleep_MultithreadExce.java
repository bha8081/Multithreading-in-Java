public class Sleep_MultithreadExce
{
    public static void main(String[] args)
    {
        Sleep_Multithread s = new Sleep_Multithread();
        s.run();

        Sleep_Multithread t = new Sleep_Multithread();
        t.start();
    }

}
