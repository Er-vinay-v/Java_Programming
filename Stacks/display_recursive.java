package Stacks;

import java.util.Stack;

public class display_recursive {
    static void display(Stack<Integer>st){
        if(st.size()==0){
            System.out.print(st.push(123)+" "); //insert at top
            return;
        }
        int top=st.pop();
        display(st);
        System.out.print(top+" ");
        st.push(top);
        //System.out.print(st.peek()+" ");
    }
    static void displayRev(Stack<Integer>st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        System.out.print(top+" ");
        displayRev(st);
        st.push(top);
        //System.out.print(st.peek()+" ");
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(7);
        st.push(9);
        st.push(12);
        System.out.println(st);
        display(st);
        System.out.println();
        displayRev(st);


    }
}
