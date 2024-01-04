package One_dimensional_array;

import java.util.TreeSet;

public class Sorting_Array {
    static void display(int []arr){
        int n=arr.length;
        for (var i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    static void sort_nonDecreasing_order(int[]arr){
        int n=arr.length;
        TreeSet ts=new TreeSet();
        for (int i=0;i<n;i++){
            ts.add(arr[i]);
        }
        System.out.println(ts);
    }
    public static void main(String[] args) {
        int[]arr={6,4,8,3,5,1,2,9,0,16};
        System.out.println("Un_sorted array");
        display(arr);
        System.out.println("sorted array");
        sort_nonDecreasing_order(arr);
        System.out.println("Time complexity of sorted array is: O(n)");
        System.out.println("space complexity of sorted array is: O(n)");
    }
}
