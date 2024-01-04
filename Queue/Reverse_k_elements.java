package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Reverse_k_elements {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        int k=5;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        System.out.println(q);
        Stack<Integer>st=new Stack<>();
        Stack<Integer>pt=new Stack<>();

        for (int i=1;i<=k;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
       for (int i=0;i<q.size()-k;i++){
           q.add(q.remove());
       }
        System.out.println();
        System.out.println(q);
    }
}
