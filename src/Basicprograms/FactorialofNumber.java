package Basicprograms;

import java.util.Scanner;

public class FactorialofNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("enter number: ");
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        for(int i = 2; i <= n; i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }

}
