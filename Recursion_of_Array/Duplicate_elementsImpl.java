package Recursion_of_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate_elementsImpl extends Duplicate_elements {
    static ArrayList<Integer>AllIndices(int[]arr,int idx,int target){
        ArrayList<Integer>ans=new ArrayList<>();
        if (idx>=arr.length){
            return ans ;
        }
        if (arr[idx]==target){
            ans.add(idx);
        }
        ArrayList<Integer>small_Ans=AllIndices(arr,idx+1,target);
        ans.addAll(small_Ans);
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr={3,4,3,6,7,6,3};
        System.out.println("Enter the target element");
        int target=sc.nextInt();
        ArrayList<Integer>ans=AllIndices(arr,0,target);
        System.out.println(ans);
//        for (Integer i:ans){  //this loop is called for each loop
//            System.out.println(i);
//        }

    }
}
