package One_dimensional_array;

import java.util.Scanner;

public class prefix_sum {
    static void array(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void prefix_sum_array(int[]arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            arr[i]=arr[i]+arr[i-1];

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter "+n+" array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        array(arr);
        System.out.println("after prefix sum array");
        prefix_sum_array(arr);
        array(arr);
    }
}
