package One_dimensional_array;
import java.util.Scanner;
public class Array_sort_2 {
    static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sort(int []arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            if (arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
            }
            if(arr[left]%2==0){
               left++;
            }
            if (arr[right]%2!=0){
                right--;
            }
        }
    }
    static void array(int[]arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter "+n+" Array elements:");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array elements");
        array(arr);
        sort(arr);
        System.out.println("sorted array is :");
        array(arr);
    }
}
