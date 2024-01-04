package Stack_question_practice;

import java.util.Stack;

public class NextGreaterElements {
    static int[]remove(int[]arr){
        Stack<Integer>st=new Stack<>();
        int n=arr.length;
        int[]res=new int[n];
        res[n-1]=-1;
        st.push(arr[n-1]);
        for (int i=n-2;i>=0;i--){
           while(st.peek()<arr[i] && st.size()>0){
               st.pop();
              break;
           }
            if (st.size()==0)res[i]=-1;
            else {
                res[i] = st.peek();
                st.push(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int []arr={1,3,2,1,8,6,3,4};
        int []res=remove(arr);
        for (int i=0;i<res.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
