package All_Sorting_algorithm;

public class swap_all_zeroes_ones_in_ascendingOrder {
    static void print(int []arr){
        for (int val:arr) System.out.print(val+" ");
    }
    static void swap(int[]arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void sort_012(int[]arr){
        int low=0,mid=0,hi= arr.length-1;
        while(mid<=hi){
            if (arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            }
            else {
                swap(arr,mid,hi);
                hi--;
            }
        }

    }
    public static void main(String[] args) {
        int[]arr={1,1,2,1,0,2,0,1,2,0,0,1,2};
        System.out.println("un_arrange array");
        print(arr);
        System.out.println();
        sort_012(arr);
        System.out.println("arrange array");
        print(arr);
    }
}
