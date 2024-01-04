package Method;

import java.util.Scanner;

public class GCD {
    static int gcd(int x,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first integer x");
        int x=sc.nextInt();
        System.out.println("Enter second integer y");
        int y=sc.nextInt();
       int ans= gcd(x,y);
        System.out.println(ans);
    }
}
