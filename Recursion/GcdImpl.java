package Recursion;

import java.util.Scanner;

public class GcdImpl extends Gcd {
    static int gcd(int x,int y){//recursive method
        if (y==0)return x;
        return gcd(y,x%y);
    }
    static int iterative_gcd(int x,int y){   //iterative method;
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
        System.out.println("common factor of "+x+ " and "+y+" is "+gcd(x,y));

    }
}
