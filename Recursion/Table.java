package Recursion;

import java.util.Scanner;

public class Table {
    static void table(int n,int a){
        if (n==1)
        {
            System.out.println(a);
            return ;
        }
         table(n-1,a);
        System.out.println(n*a);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want to print that number table");
        int n=10;
        int a=sc.nextInt();
        System.out.println("Table of "+a+" is :");
        table(n,a);
    }
}
