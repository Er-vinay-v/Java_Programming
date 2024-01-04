package Searching_Algorithm;

import java.util.Scanner;

public class Find_sqrt {
    static int sqrt(int x){
        int st=0,end=x;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int val=mid*mid;
            if (x==val){
                return mid;
            } else if (val<x) {
                ans=mid;
                st=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter which no. of square root you want ");
        int x=sc.nextInt();
        int num=sqrt(x);
        System.out.println("the square root of "+x+" is "+num);
    }
}
