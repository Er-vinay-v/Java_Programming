package Recursion;

import java.util.Scanner;

public class Digit_sum {
    static int SumOfDigits(int n){
        if (n>=0 && n<=9)return n;
       // if (n<10) return n;
        int ans =SumOfDigits(n%10)+SumOfDigits(n/10);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n digits number");
        int n=sc.nextInt();
        int sum=SumOfDigits(n);
        System.out.println("sum of digits "+n+" is");
        System.out.println(sum);
    }
}
