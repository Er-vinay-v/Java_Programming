package Searching_Algorithm;

public class firstOccurance {
    static int firstOcc(int[]arr,int x){
        int n=arr.length;
        int st=0,end=n-1;
        int fo=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if (x==arr[mid]){
                fo=mid;
               end=mid-1;//first occurance index
                //st=mid+1;  //last occurance index
            } else if (x<arr[mid]) {
                end=mid-1;
            }
            else st=mid+1;
        }
        return fo;
    }
    public static void main(String[] args) {
        int[]arr={1,2,2,2,4,5,6,7,7,8};
        int x=2;
        int ans=firstOcc(arr,x);
        System.out.println("the index of first occurence of target elements is :"+ans);

    }
}
