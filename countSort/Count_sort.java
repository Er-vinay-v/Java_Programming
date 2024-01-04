package countSort;

public class Count_sort {
    static void display(int []arr){
        for (int val:arr) System.out.print(val+" ");
        System.out.println();
    }

    static int findMax(int[]arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (max<arr[i])max=arr[i];
        }
        return max;
    }
    static void countSort(int[]arr){
        int max=findMax(arr);
        int []freq=new int[max+1];
        for (int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<freq.length;i++){
            for (int j=0;j<freq[i];j++){
                arr[k++]=i;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,4,2,1,5,4,1,2};
        System.out.println("Original array");
        display(arr);
        countSort(arr);
        System.out.println("sorted array");
        display(arr);
    }
}
