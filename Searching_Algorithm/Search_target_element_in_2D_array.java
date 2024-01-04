package Searching_Algorithm;

public class Search_target_element_in_2D_array {
    static boolean Find_target(int[][]arr,int target){
        int n=arr.length,m=arr[0].length;
        int st=0,end=n*m-1;
        while (st<=end){
            int mid=st+(end-st)/2;
            int mid_elt=arr[mid/m][mid%m];
            if (mid_elt==target)return true;
            if (target<mid_elt)end=mid-1;
            else st=mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][]arr={{1,2,3,4},{5,6,7,8,9},{10,11,12,13}};
        int target=11;
       boolean ans= Find_target(arr,target);
        System.out.println(ans);
    }
}
