package Recursion_of_Array;

import java.util.Scanner;

public class Target_elementsImpl extends Target_elements {
    static int search(int []arr,int idx,int target){
        if (idx>=arr.length)return -1;
        if (arr[idx]==target)return idx;
        return search(arr,idx+1,target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr={4,5,6,86,34,45};
        System.out.println("Enter the target elements");
        int target=sc.nextInt();
        int ans=search(arr,0,target);
        System.out.println("The index of target element is : "+ans);
    }
}
