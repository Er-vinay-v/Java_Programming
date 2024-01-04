package One_dimensional_array;

import java.util.ArrayList;

public class Add_two_array {
    public static void main(String[] args) {
        int[]l1={2,3,5,7};
        int[]l2={9,9,7,4};
        int x=0;
        ArrayList<Integer>ans=new ArrayList<>();//not completed
        for (int i=0;i<l1.length;i++){
            if (l1[i]+l2[i]>=10){
                ans.add((l1[i]+l2[i])%10);
                x=(l1[i]+l2[i])/10;
            }
            else{
                ans.add(l1[i]+l2[i]+x%10);
                x=x/10;
            }
        }
        System.out.print(ans);
    }
}
