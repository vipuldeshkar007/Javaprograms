package Basicprograms;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }
        return true;
    }
    public static void main(String args[]){
        int n = 53;
        if(isPrime(n)) {
            System.out.println(n + " is a prime number ");
        }else{
            System.out.println(n + " is not a prime number ");
        }
    }
}
