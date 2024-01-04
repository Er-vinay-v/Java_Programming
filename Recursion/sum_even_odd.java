package Recursion;

import java.util.Scanner;

public class sum_even_odd {
    static int sum(int n){

        if (n==0){
            return 0;
        }

        if (n%2==0){
            return sum(n-1)-n;
        }
        else{
            return sum(n-1)+n;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer");
        int n=sc.nextInt();
       int ans= sum(n);
        System.out.println(ans);
    }
}
