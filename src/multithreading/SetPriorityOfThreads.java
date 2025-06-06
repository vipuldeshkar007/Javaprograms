package multithreading;

public class SetPriorityOfThreads extends Thread{

    public String name;
    public SetPriorityOfThreads(String name){
        this.name = name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name+ " == "+Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {

        SetPriorityOfThreads low = new SetPriorityOfThreads("Inside low");
        SetPriorityOfThreads medium = new SetPriorityOfThreads("Inside Medium");
        SetPriorityOfThreads high = new SetPriorityOfThreads("Inside High");
        high.setPriority(Thread.MIN_PRIORITY);
        medium.setPriority(Thread.NORM_PRIORITY);
        low.setPriority(Thread.MAX_PRIORITY);
        medium.start();
        high.start();
        low.start();

    }
}
