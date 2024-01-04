package Stacks;

import java.util.Stack;

public class Basics_of_stacks {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        System.out.println(st);
        System.out.println("Size is : "+st.size());
        st.push(5);//push function are used to add the elements from stacks
        st.push(6);
        st.push(9);

        System.out.println(st);//it prints all the elements of stacks
        System.out.println(st.peek());//peak():- this function is used for print top of elements in stacks
        System.out.println("Size is : "+st.size());

        st.pop();//this function are used for delete top most elements from stack
        System.out.println(st);//it prints all the elements of stacks
        System.out.println(st.peek());//peak():- this function is used for print top of elements in stacks
        System.out.println("Size is : "+st.size());

        while (st.size()>1){  //print first elements of stacks
            st.pop();
        }
        System.out.println(st);
        System.out.println(st.peek());
    }
}
