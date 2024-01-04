package Queue;
import java.util.*;

public class Reverse_Queue {
    static void stack(Queue<Integer>q){
        Stack<Integer>st=new Stack<>();
        while(q.size()!=0){
            st.push(q.remove());
        }
        while(st.size()!=0){
           // System.out.print(st.peek()+" ");
            q.add(st.pop());
        }
        System.out.println(q);
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        stack(q);

    }
}
