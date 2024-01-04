package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class print_queue_elements_without_inbuiltFunction {
    public static void main(String[] args) {
        Queue<Integer>q=new LinkedList<>();
        Queue<Integer>temp=new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        q.add(25);
        q.add(30);

       while (q.size()!=0){
           System.out.print(q.peek()+" ");
           temp.add(q.remove());
       }
        System.out.println();
       while(temp.size()>0){
           q.add(temp.remove());
       }
        System.out.println(q);
    }
}
