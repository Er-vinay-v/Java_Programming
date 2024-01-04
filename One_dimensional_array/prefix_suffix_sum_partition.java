package One_dimensional_array;

import java.util.Scanner;

public class prefix_suffix_sum_partition {
    static int findArraySum(int[]arr){
        int total=0;
        for (int i=0;i<arr.length;i++){
            total +=arr[i];
        }
        return total;
    }
    static boolean equalSumPartition(int[]arr){
        int totalSum=findArraySum(arr);
        int prefixSum=0;
        for (int i=0;i<arr.length;i++){
            prefixSum +=arr[i];
            int suffixSum=totalSum-prefixSum;
            if (suffixSum==prefixSum){
                return true;
            }
        }
        return false;
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
        System.out.println("Equal partition possible :"+equalSumPartition(arr));
    }
}
