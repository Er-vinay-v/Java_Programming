package Recursion;

import java.util.Scanner;

public class Basics {
    static void counting(int n){
        if (n==1){
            System.out.print(n+" ");
            return ;
        }
        System.out.println(n); //reverse counting
        counting(n-1);
        //System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer");
        int n=sc.nextInt();
        System.out.println("counting");
        counting(n);
    }
}
