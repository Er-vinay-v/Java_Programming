package Collection_Frame_Work;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterfaceExamples {
    static void LinklistQueueExamples(){
        LinkedList<Integer>l=new LinkedList<>();
        l.add(2);
        l.add(8);
        l.add(5);
        l.add(11);
        System.out.println(l);
        System.out.println(l.peek());
        System.out.println(l.pop());
        System.out.println(l);
    }
    static void PriorityQueueExamples(){
        PriorityQueue<Integer>pq=new PriorityQueue<>();//first priority give of smallest element
       // PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());//first priority of large ele
        pq.add(10);
        pq.add(4);
        pq.add(3);
        pq.add(8);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.peek());
    }
    public static void main(String[] args) {
        //PriorityQueueExamples();
        LinklistQueueExamples();
    }
}
