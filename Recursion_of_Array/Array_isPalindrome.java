package Recursion_of_Array;

import java.util.Scanner;

public class Array_isPalindrome {
    static int IsPalindrome(int []arr,int i,int j){
        if (i>=j)return 1;
       if (arr[i]==arr[j]){
           return IsPalindrome(arr,i+1,j-1);
       }
       else {
           return 0;
       }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[]arr={1,2,3,2,1};
        int n=arr.length;
      if (IsPalindrome(arr,0,n-1)==1){
          System.out.println("Array is palindrome");
      }
      else{
          System.out.println("Not palindrome");
      }
    }
}
