package All_Sorting_algorithm;

public class CountSort {
    static void display(int[]arr){
        for (int val:arr) System.out.print(val+" ");
    }
    static int findMax(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (max<arr[i])max=arr[i];
        }
        return max;
    }
    static void count_sort(int[]arr){
        int max=findMax(arr);
        int[] count=new int[max+1];
        for (int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j=0;j<count[i];j++){
                arr[k++]=i;

            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,7,4,3,2,1,6,4,3};
        System.out.println("unsorted array");
        display(arr);
        count_sort(arr);
        System.out.println();
        System.out.println("sorted array");
        display(arr);
    }
}
