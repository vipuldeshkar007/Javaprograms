package multithreading;

public class MultithreadWithState extends Thread{
    @Override
    public void run(){
        System.out.println("Hello");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MultithreadWithState multithreadWithState  = new MultithreadWithState();
        System.out.println(multithreadWithState.getState());
        multithreadWithState.start();
        System.out.println("After Start == "+multithreadWithState.getState());
        System.out.println("Count == "+Thread.activeCount());
        Thread.sleep(100);
        System.out.println("CurrentState == "+multithreadWithState.getState());
        multithreadWithState.join();
        System.out.println("CurrentState == "+multithreadWithState.getState());
    }
}
