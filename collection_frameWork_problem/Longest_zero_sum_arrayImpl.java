package collection_frameWork_problem;

import java.util.HashMap;

public class Longest_zero_sum_arrayImpl extends Longest_zero_sum_array {
    static int longestZeroArray(int[]arr){
        int n=arr.length;
        int maxLen=0, sum=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if (mp.containsKey(sum)){
                maxLen++;//number of sub array whose contain zero {2,-2}={0} and {-8,1,7}={0}
            }
            else{
                mp.put(sum,i);
            }
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[]arr={15,-2,2,-8,1,7,10};
        int ans=longestZeroArray(arr);
        System.out.println(ans);
    }
}
