package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacci(int n){          // 1 1 2 3 5 8 13 21
        if (n<=2) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer ");
        int n=sc.nextInt();
        int fibo=fibonacci(n);
        System.out.println("fibonacci of "+n+" number sum is "+fibo);
    }
}
