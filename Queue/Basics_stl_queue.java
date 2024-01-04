package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basics_stl_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();  // or Queue<Integer>q=new Dequeue<>(); is also valid
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        System.out.println("size: "+q.size());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println("first elements: "+q.peek());



    }
}
