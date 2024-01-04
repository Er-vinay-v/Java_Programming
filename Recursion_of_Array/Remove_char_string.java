package Recursion_of_Array;

import java.util.Scanner;

public class Remove_char_string {
    static String removeChar(String s,int idx){
        if (idx==s.length())return "";
        String small_ans=removeChar(s,idx+1);
        char currentChar=s.charAt(idx);
        if (currentChar!='a')return currentChar+small_ans;
        else return small_ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();

        String ans=removeChar(s,0);
        System.out.println(ans);
    }
}
