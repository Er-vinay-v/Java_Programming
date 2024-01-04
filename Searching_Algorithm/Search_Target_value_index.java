package Searching_Algorithm;

public class Search_Target_value_index {
    static int search_target_idx(int[]arr,int target){
        int n=arr.length;
        int st=0,end=n-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            if (target==arr[mid]){
                return mid;
            }
           else if (arr[mid]<arr[end]) {
               if (target>arr[mid] && target<=arr[end]) {
                    st = mid + 1;
                }
                else {
                    end=mid-1;
               }
            }
            else {
                if (target>=arr[st] && target<arr[mid]){
                    end=mid-1;
                }
                else{
                    st=mid+1;
                }
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={5,6,7,8,9,1,2,3,4};
        int target=7;
        System.out.println(search_target_idx(arr,target));
    }
}
