package One_dimensional_array;


import java.util.Arrays;
import java.util.Scanner;
public class Array_of_smallest_largest_value {
    static int[] min_max_array_elements(int[]arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] ans=min_max_array_elements(arr);
        System.out.println("smallest element :"+ans[0]);
        System.out.println("largest elements :"+ans[1]);

    }
}
