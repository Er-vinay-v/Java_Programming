package Recursion;

import java.util.Scanner;

public class Square_of_two_no {
    static int power(int p,int q){
        int ans=1;
        if (q==0) return 1;
        ans =p*power(p,q-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base of p");
        int p=sc.nextInt();
        System.out.println("Enter the power of q");
        int q=sc.nextInt();
        int ans=power(p,q);
        System.out.println("Square of base " +p+" to the power "+ q+ " is  "+ans);
    }
}
