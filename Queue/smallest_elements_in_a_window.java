package Queue;

import java.util.*;

public class smallest_elements_in_a_window {
    public static void main(String[] args) {
        int[]arr={-1,2,3,8,-5,6,-4,8};
        int k=3;
        int n=arr.length;
        int[]res=new int[n-k+1];
        Queue<Integer>q=new LinkedList<>();
        for (int i=0;i<n;i++){
            if (arr[i]<0){
                q.add(i);
            }
        }
        for (int i=0;i<n-k+1;i++){
            if (q.size()>0 && q.peek()<i)q.remove();
            if (q.size()>0 && q.peek()<=i+k-1){
                res[i]=arr[q.peek()];
            }
            else if (q.size()==0)res[i]=0;
            else res[i]=0;
        }
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
