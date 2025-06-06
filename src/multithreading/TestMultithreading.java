package multithreading;

public class TestMultithreading {

    public static void main(String[] args) {
        Multithread multiThread = new Multithread();
        multiThread.start();
        MultithreadUsingRunnable multithreadUsingRunnable = new MultithreadUsingRunnable();
        Thread t1 = new Thread(multithreadUsingRunnable);
        t1.start();
        for(; ; ){
            System.out.println("Vipul");
        }
    }
}
