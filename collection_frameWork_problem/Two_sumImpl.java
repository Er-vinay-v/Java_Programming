package collection_frameWork_problem;

import java.util.HashMap;

public class Two_sumImpl extends Two_sum {
    static int[]targetSumIdx(int[]arr,int target){
        int n=arr.length;
        HashMap<Integer,Integer>mp=new HashMap<>();
        int[]ans={-1};
        for (int i=0;i<n;i++){
            if(mp.containsKey(target-arr[i])){
                ans= new int[]{i,mp.get(target-arr[i])};
                return ans;
            }
           mp.put(arr[i],i);

        }
        return ans;
    }
    public static void main(String[] args) {
        int[]arr={14,7,10,4,5,9,1,2};
        int target=13;
        int[] ans=targetSumIdx(arr,target);
        for (int val:ans){
            System.out.print(val+" ");
        }
    }
}
