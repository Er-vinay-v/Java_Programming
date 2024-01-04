package Queue;

import java.util.Stack;

public class Stack_implementation {
    public static class Stq{
        Stack<Integer>st=new Stack<>();
        Stack<Integer>ts=new Stack<>();

        public void add(int val){
            st.push(val);
        }
        public int remove(){
            while(st.size()>1){
                ts.push(st.pop());
            }
            int x=st.pop();
            while(ts.size()!=0){
                st.push(ts.pop());
            }
            return x;
        }
        public int peek()throws Exception{
            while(st.size()>1){
                ts.push(st.pop());
            }
            int x=st.peek();
            while(ts.size()!=0){
                st.push(ts.pop());
            }
            return x;
        }
        public int size(){
            return st.size();
        }
        public boolean isEmpty(){
            return st.size()==0;
        }
        public void display(){
                while (st.size()!=0){
                    ts.push(st.pop());
                }
          while(ts.size()!=0){
              System.out.print(ts.peek()+" ");
              st.push(ts.pop());
          }
            System.out.println();
        }
    }
    public static void main(String[] args)throws Exception {
    Stq q=new Stq();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(12);
        q.display();
        System.out.println(q.peek());
        q.remove();
        System.out.println(q.size());
        q.display();


    }
}
