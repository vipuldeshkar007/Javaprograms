package multithreading;

import java.lang.Thread;
import java.lang.Runnable;
public class PrintOldEvenNumbers {
    public static void printNumber(String type){
        for(int i = 1; i <= 1000000000;i++){
            if(type.equals("even") && i%2==0) {
//                System.out.println("Printing even No -- ");
//                System.out.println(i);
            }else if(type.equals("odd") && i%2 != 0){
//                System.out.println("Printing odd No -- ");
//                System.out.println(i);
            }
        }
    }
    public static void withMultithreading(){
        Runnable even = () -> printNumber("even");
        Runnable odd = () -> printNumber("odd");
        Thread t1 = new Thread(even, "evenThread");
        Thread t2 = new Thread(odd, "oddThread");
        long start = System.nanoTime();
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long end = System.nanoTime();
        System.out.println("Execution completed --- " + (end - start)/1_000_000 +" in ms with multithreaded env");
    }
    public static void withoutMultithreading(){

        long start = System.nanoTime();
        printNumber("even");
        printNumber("odd");
        long end = System.nanoTime();
        System.out.println("Execution completed --- " + (end - start)/1_000_000 +" in ms with singlethreaded env");
    }
    public static void main(String args[]){
        withMultithreading();
        withoutMultithreading();
    }
}
