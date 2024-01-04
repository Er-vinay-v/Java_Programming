package Recursion_of_Array;

import java.util.Scanner;

public class check_string_palindromeImpl extends check_string_palindrome {
    static boolean IsPalindrome(String s,int i,int j ){
        if(i>=j)return true;
        return s.charAt(i)==s.charAt(j)&& IsPalindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String s=sc.nextLine();
        System.out.println(IsPalindrome(s,0,s.length()-1));
    }
}
