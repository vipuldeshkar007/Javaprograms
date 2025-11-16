package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceImpl {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < 5; i++){
            int taskId = i;
            es.submit(() -> {
                System.out.println("Runnable task -- " +taskId+ " started by " +Thread.currentThread().getName());
                heavy();
                System.out.println("Runnable task -- "+taskId+ " finished by "+Thread.currentThread().getName());
            });
        }
        es.shutdown();
        try {
            es.awaitTermination(1, TimeUnit.MINUTES);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        if(es.isShutdown()){
            System.out.println("Thread is shutdown");
        }

        long endTime = System.currentTimeMillis();
        System.out.println("All tasks completed in " + (endTime - startTime) + " ms");
    }

    public static void heavy(){
        long sum =0 ;
        for(int i=0; i < 100000; i++){
            sum += i;
        }
    }
}
