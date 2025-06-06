package multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultithreadingLock {
    private Integer balance =200000;
    private final Lock lock = new ReentrantLock();

    private void withdraw(Integer amount){
        System.out.println(Thread.currentThread().getName() +  "Attempting to withdraw " + amount);
        try{
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if(amount < balance){
                    try {
                        System.out.println("Proceeding for withdraw");
                        Thread.sleep(100);
                        balance -= amount;
                        System.out.println("Pending Amount ==" + balance);
                    }catch(Exception e){

                    }finally{
                        lock.unlock();
                    }
                }else{
                    System.out.println("Insufficient balance");
                }
            }else{
                System.out.println("Could not acquire the lock will try again later");
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            System.out.println("Thank you");
        }
    }

    public static void main(String[] args) {
        MultithreadingLock nultithreadingLock  = new MultithreadingLock();
        Runnable r =()-> {
            nultithreadingLock.withdraw(2000);
        };
        r.run();
        Thread t1 = new Thread(r, "Thread 1");
        Thread t2 = new Thread(r, "Thread 2");
        t1.start();
        t2.start();

    }
}
