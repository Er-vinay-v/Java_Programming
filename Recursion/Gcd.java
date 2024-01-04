package Recursion;

import java.util.Scanner;

public class Gcd {
    static int iterative_gcd(int x,int y){
        while (x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first integer");
        int x=sc.nextInt();
        System.out.println("Enter second integer");
        int y=sc.nextInt();
        int ans=iterative_gcd(x,y);
        System.out.println("common factor of "+x+ " and "+y+" is "+ans);
    }
}
