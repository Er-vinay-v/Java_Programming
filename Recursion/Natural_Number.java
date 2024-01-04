package Recursion;

import java.util.Scanner;

public class Natural_Number {
    static void NaturalNumber(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        //System.out.print(n+" ");
        NaturalNumber(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number where you want to print natural no. ");
        int n=sc.nextInt();
        System.out.println("Natural number 1 to "+n);
        NaturalNumber(n);
    }
}
