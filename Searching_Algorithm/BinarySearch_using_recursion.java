package Searching_Algorithm;

public class BinarySearch_using_recursion {
    static boolean binarySearch(int[]arr,int st,int end,int target){
        if (st>end)return false;
        int mid=(st+end)/2;
        if (target==arr[mid])return true;
        else if (target<arr[mid]){
            return binarySearch(arr,st,mid-1,target);
        }
        else{
            return binarySearch(arr,mid+1,end,target);
        }

    }
    public static void main(String[] args) {
        int[]arr={2,3,4,6,8,9,11,12};
        System.out.println(binarySearch(arr,0,arr.length-1,16));
    }
}
