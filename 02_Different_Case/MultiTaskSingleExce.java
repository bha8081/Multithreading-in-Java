public class MultiTaskSingleExce {
    public static void main(String[] args)
    {
        // Create thread 1;
        MultiTaskSingle th1 = new MultiTaskSingle();
        th1.run();

        // Create thread 2;
        MultiTaskSingle th2 = new MultiTaskSingle();
        th2.run();

        // Create thread 3;
        MultiTaskSingle th3 = new MultiTaskSingle();
        th3.run();

        // Create thread 4;
        MultiTaskSingle th4 = new MultiTaskSingle();
        th4.run();
    }
}
