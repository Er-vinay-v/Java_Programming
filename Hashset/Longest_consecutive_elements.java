package Hashset;

import java.util.HashSet;

public class Longest_consecutive_elements {
    static int Lce(int[]arr){
        HashSet<Integer>st=new HashSet<>();
        for (int val:arr)st.add(val);
        int maxStreak=0;
        for (int val:st){
            if (!st.contains(val-1)){
                int currNum=val;
                int currStreak=1;
                while (st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak=Math.max(maxStreak,currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        int[]arr={100,0,55,1,200,2,5,3,4};
        int ans=Lce(arr);
        System.out.println(ans);
    }
}
