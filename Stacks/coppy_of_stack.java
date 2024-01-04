package Stacks;

import java.util.Stack;

public class coppy_of_stack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(4);
        st.push(7);
        st.push(9);
        st.push(12);
        System.out.println(st);
        Stack<Integer>gt=new Stack<>();
        while(st.size()!=0){
            gt.push(st.pop());
        }
       // System.out.println(gt);

        Stack<Integer>ct=new Stack<>();
        while(gt.size()!=0){
            ct.push(gt.pop());
        }
//        System.out.println("copy stacks");
//        System.out.println(ct);

        while(ct.size()!=0){
            st.push(ct.pop());
        }
        System.out.println("Reverse : "+st);
        System.out.println(ct);
    }
}
