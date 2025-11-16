package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

public class RerentantLock {
    public static Lock lock = new ReentrantLock();
    public static void printNumber(String type,Integer i) throws InterruptedException {
            System.out.println(Thread.currentThread().getName());
            try {
                lock.lock();
                System.out.println(Thread.currentThread().getName() + " acquired lock");
                if (type.equals("even") && i % 2 == 0) {
                    System.out.println("Printing even No -- ");
                    System.out.println(i);
                } else if (type.equals("odd") && i % 2 != 0) {
                    System.out.println("Printing odd No -- ");
                    System.out.println(i);
                }
                Thread.sleep(1000);

            }catch (InterruptedException ie){
                ie.printStackTrace();
            }finally {
                System.out.println(Thread.currentThread().getName() + " releasing lock");
                lock.unlock();
            }

    }
    public static void withMultithreading() throws InterruptedException {
        long start = System.nanoTime();
        for(int i=0;i<5;i++) {
            int finalI=i;
            Thread t = new Thread(() -> {
                try {
                    printNumber("even", finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            },"even-thread");
            Thread t2 = new Thread(() -> {
                try {
                    printNumber("odd", finalI);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            },"odd-thread");
            t.start();
            t2.start();
            long end = System.nanoTime();
            System.out.println("Execution completed --- " + (end - start)/1_000_000 +" in ms with multithreaded env");
        }
    }
    public static void withoutMultithreading() throws InterruptedException {

        long start = System.nanoTime();
        for(int i=0;i<5;i++) {
            printNumber("even", i);
            printNumber("odd",i);
        }
        long end = System.nanoTime();
        System.out.println("Execution completed --- " + (end - start)/1_000_000 +" in ms with singlethreaded env");
    }
    public static void main(String[] args) throws InterruptedException {
//        withoutMultithreading();
        withMultithreading();
    }
}
