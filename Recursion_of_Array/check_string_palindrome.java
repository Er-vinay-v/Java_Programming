package Recursion_of_Array;

import java.util.Scanner;

public class check_string_palindrome {
    static String reverse(String s,int idx){
        if (idx==s.length())return "";
        String s_ans=reverse(s,idx+1);
        return s_ans+s.charAt(idx) ;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=sc.nextLine();
       // System.out.println(str);
        String rev=reverse(str,0);
        //System.out.println(rev);
       if (rev.equals(str)){
           System.out.printf("%s is palindrome ",rev);
       }
       else{
           System.out.printf("%s is  Not palindrome",rev);
       }
    }
}
