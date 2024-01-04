package All_Sorting_algorithm;

public class bubble_sort {
    static void display_array(int []arr){
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }
    static void bubbleSort(int []arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag)return;
        }
    }
    public static void main(String[] args) {
        int[]arr={2,4,1,3,6,5,7};
        System.out.println("before sorted array");
        display_array(arr);
        System.out.println();
        bubbleSort(arr);
        System.out.println("sorted array");
        display_array(arr);
    }
}
