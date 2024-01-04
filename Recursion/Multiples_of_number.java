package Recursion;

import java.util.Scanner;

public class Multiples_of_number {
    static void multiples(int n,int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        multiples(n,k-1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which number of multiple you want");
        int n=sc.nextInt();
        System.out.println("Enter how many number of multiple you want");
        int k=sc.nextInt();
        multiples(n,k);

    }
}
