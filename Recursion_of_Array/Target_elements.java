package Recursion_of_Array;

public class Target_elements {
    static boolean targetEle(int[]arr,int idx,int target){
        if (idx>=arr.length){
            return false;
        }
        if (arr[idx]==target)return true;
        return targetEle(arr,idx+1,target);
    }
    public static void main(String[] args) {
        int []arr={4,5,6,7,23,9};
       // boolean bool=targetEle(arr,0,70);
       // System.out.println(bool);
        if (targetEle(arr,0,7)){
            System.out.println("yes");
        }
        else System.out.println("No");
    }
}
