package Searching_Algorithm;

public class Distribution_property {
   static boolean isDivissionPossible(int []arr,int m,int mxChocAllowed){
        int No_Of_students=1;
        int choc=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mxChocAllowed)return false;
            if (choc +arr[i]<=mxChocAllowed){
                choc+=arr[i];
            }else{
                No_Of_students++;
                choc=arr[i];
            }
        }
        return No_Of_students<=m;
    }
    static int distribute_chocolates(int[]arr,int m){
        if (arr.length<m)return -1;
        int ans=0,st=1,end=(int)1e9;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (isDivissionPossible(arr,m,mid)){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={12,34,67,90};
        int m=2;
        System.out.println(distribute_chocolates(arr,m));
    }
}
