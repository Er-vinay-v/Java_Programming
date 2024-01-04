package Recursion_of_Array;

public class sum_of_array {
    static int min(int[]arr,int idx){
        if (idx==arr.length-1)return arr[idx];
        int smallAns=min(arr,idx+1);
        return Math.min(arr[idx],smallAns);
    }
    static int sum(int[]arr,int idx){
        if (idx==arr.length-1){
            return arr[idx];
        }
        int small_ans =sum(arr,idx+1);
        //return Math.addExact(arr[idx],small_ans);
        return small_ans+arr[idx];
    }
    public static void main(String[] args) {
        int []arr={2,8,6,9,4};
        int ans=sum(arr,0);
        System.out.println(ans);
        System.out.println("smallest array elements");
        int ans1=min(arr,0);
        System.out.println(ans1);
    }
}
