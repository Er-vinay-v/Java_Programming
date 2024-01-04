package Recursion_of_Array;

import java.util.Scanner;

public class Reverse_string {
    static String Reverse(String s,int idx){
        if (idx==s.length())return " " ;
        String s_ans=Reverse(s,idx+1);
        return s_ans+s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
       String ans= Reverse(str,0);
        System.out.println(ans);

    }
}
