package multithreading;

public class RunnableWithLambdaExp{

    public static void main(String[] args) {
        Runnable r1 = (() ->System.out.println("Inside R1"));
        Runnable r2 = (() ->System.out.println("Inside R2"));
        Runnable r3 = (() ->System.out.println("Inside R3"));
        r1.run();
        r2.run();
        r3.run();
        Thread t = new Thread(r1);
        System.out.println(t.getName());
        System.out.println(t.getState());
        t.setName("R!");
        System.out.println(t.getName());
    }

}
