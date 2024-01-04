package Stacks;

import java.util.Stack;

public class InsertAt {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(7);
        st.push(9);
        st.push(12);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        int idx = 6;
        int val = 121;
        while (st.size() >= idx) {
            temp.push(st.pop());
        }
        st.push(val);
        while (temp.size() != 0) {
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}

