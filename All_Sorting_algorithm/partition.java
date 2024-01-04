package All_Sorting_algorithm;

public class partition {
    static void array(int[]arr){
        for (int i:arr) System.out.print(i+" ");
    }
    static void Array_partition(int[]arr){
        int l=0,r=arr.length-1;
        while(l<r){
            while(arr[l]<0)l++;
            while(arr[r]>=0)r--;
            if (l<r){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={4,2,-5,45,6,0,-8,-12,13,-34};
        System.out.println("original array");
        array(arr);
        System.out.println();
        Array_partition(arr);
        System.out.println("sorted array mins one side negative no. and other side positive no. order is not necessary");
    array(arr);
    }
}
