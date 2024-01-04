package Recursion;

import java.util.Scanner;

public class Digits_count {
    static int Count(int n){
        int ans=0;
        if (n<10) return 1;
      ans=  Count(n%10) + Count(n/10);

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of digits");
        int n=sc.nextInt();
        System.out.println("No. of count is ");
        int ans=Count(n);
        System.out.println(ans);
    }
}
