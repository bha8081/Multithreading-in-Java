public class SingleTaskMultiExce {
    public static void main(String[] args)
    {
        // Create thread 1;
        SingleTaskMulti th1 = new SingleTaskMulti();
        th1.run();

        // Create thread 2;
        SingleTaskMulti th2 = new SingleTaskMulti();
        th2.run();

        // Create thread 3;
        SingleTaskMulti th3 = new SingleTaskMulti();
        th3.run();

        // Create thread 4;
        SingleTaskMulti th4 = new SingleTaskMulti();
        th4.run();
    }
}
