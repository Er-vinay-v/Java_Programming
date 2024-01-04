package Recursion;

import java.util.Scanner;

public class Square_of_two_no_1 extends Square_of_two_no {  //this is the optimized code compare to before code
    static int power(int p,int q){
        int ans=1;
        if (q==0)return 1;
        if (q%2==0){
            int smallAns=power(p,q/2);
            ans=smallAns*smallAns;
        }
        else {
            int smallAns=power(p,q/2);
            ans=smallAns*smallAns*p;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base");
        int p=sc.nextInt();
        System.out.println("Enter power");
        int q=sc.nextInt();
        int ans=power(p,q);
        System.out.println("power of base "+p+" to "+q+" is "+ans);
    }
}
