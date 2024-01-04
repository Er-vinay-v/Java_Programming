package Searching_Algorithm;

public class Binary_Search {
    static boolean search_target(int[]arr,int target){
        int n=arr.length;
        int st=0,end=n-1;

        while (st<=end){
            int mid=(st+end)/2;
            if (target==arr[mid]){
                return true;
            }
            else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                st=mid+1;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9}; //binary search always exist on sorted array
        int target=9;
      // boolean b= search_target(arr,target);
        System.out.println(search_target(arr, target));

    }
}
