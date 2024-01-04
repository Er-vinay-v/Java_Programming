package Stack_question_practice;

import java.util.Stack;

public class Privious_greater_elements {
    static int[] findPreeMx(int[]arr){
        int n=arr.length;
        Stack<Integer>st=new Stack<>();
        int[]res=new int[arr.length];
        res[0]=-1;
        st.push(arr[0]);
        for (int i=1;i<n;i++){
            if(st.peek()>arr[i]){
                res[i]=st.peek();
                st.push(arr[i]);
            }
            while(arr[i]>st.peek() && st.size()>0){
                st.pop();
            }
            if(st.peek()>arr[i]){
                res[i]=st.peek();
                st.push(arr[i]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[]arr={100,80,60,70,60,75,85,90};
        int[]preeMx=findPreeMx(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(preeMx[i]+" ");
        }
    }
}
