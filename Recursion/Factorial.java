package Recursion;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if (n==0 ) return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer number ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+" is ");
        int fac=factorial(n);
        System.out.println("Factorial "+n+" is "+fac);
    }
}
