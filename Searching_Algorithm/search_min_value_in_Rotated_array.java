package Searching_Algorithm;

public class search_min_value_in_Rotated_array {
    static void print(int[]arr){
        for (int val:arr) System.out.print(val+" ");
    }
    static int finnd_min(int[]arr,int target){
        int n=arr.length;
        int st=0,end=n-1;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (target==arr[mid]){
                //ans=mid;
                return mid;
            }
            else if(arr[mid]<mid-1){
                end=mid-1;
            }
            else{
                st=mid+1;

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,1,2};
        int target =1;
        System.out.println("unsorted array");
        print(arr);
        System.out.println();
        int min=finnd_min(arr,target);
        System.out.println("The min elements of array is present in the indexes of : "+min);

    }
}
