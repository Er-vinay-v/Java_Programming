package Recursion_of_Array;

import java.util.Scanner;

public class Duplicate_elements {
    static void DuplicateSearch(int []arr,int idx,int target){
        if (idx>=arr.length) return;
        if (arr[idx]==target) System.out.print(idx+" ");;
         DuplicateSearch(arr,idx+1,target);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={4,3,7,3,4,3,4};
        System.out.println("Enter target elements ");
        int target=sc.nextInt();
        System.out.println("Indexes of target elements: ");
        DuplicateSearch(arr,0,target);


    }
}
