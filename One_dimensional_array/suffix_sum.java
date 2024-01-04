package One_dimensional_array;

import java.util.Scanner;

public class suffix_sum {
    static void array(int []arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void suffixSum(int []arr){
        int n=arr.length;
        for (int i=n-2;i>=0;i--){
            arr[i]=arr[i]+arr[i+1];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("Enter "+n+" array elements");
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("original array");
        array(arr);
        System.out.println("suffix sum of array");
        suffixSum(arr);
        array(arr);
    }
}
