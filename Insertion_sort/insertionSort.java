package Insertion_sort;

public class insertionSort {
    static void insertionSort(int []arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,4,1,5,3,6,0,8};
        insertionSort(arr);
        for (int val:arr){
            System.out.print(val+" ");
        }
    }
}
