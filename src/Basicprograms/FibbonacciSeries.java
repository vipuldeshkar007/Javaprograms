package Basicprograms;

public class FibbonacciSeries {
    public static void main(String args[]){
        int n=10, a = 0, b=1;
        System.out.print("Fibonacci Series --- " +a+ ", " +b);
        for(int i = 2; i < n; i++){
            int next = a+b;
            a = b;
            b = next;
            System.out.print(", "+next);
        }

    }
}
