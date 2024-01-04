package Queue;

import java.util.Deque;
import java.util.LinkedList;

public class deque {
    public static void main(String[] args) {
        Deque<Integer>dq=new LinkedList<>();
//        dq.addFirst(1);
//        dq.addFirst(2);
//        dq.addFirst(3);
//        dq.addLast(4);
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(0);
        dq.add(5);
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        System.out.println(dq.peek());
        System.out.println(dq);
        System.out.println(dq.peek());
    }
}
