package Queue;

public class LinkedList_Implementation {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class queue{
        node head=null;
        node tail=null;
        int size=0;
        void add(int x){
            node temp=new node(x);
            if (size==0){
                head=tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        int peek(){
            if (size==0){
                System.out.println("queue is empty!");
                return -1;
            }
            return  head.val;
        }
        int remove(){
            if (size==0){
                System.out.println("Queue is empty!");
                return -1;
            }
            size--;
            int a=head.val;
            head=head.next;
            return a;
        }
        void display(){
            if (size==0){
                System.out.println("queue is empty!");
                return;
            }
            node temp=head;
            while (temp!=tail.next){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queue t=new queue();
        t.add(2);
        t.add(3);
        t.add(4);
        t.add(5);
        t.add(6);
        t.add(7);
        t.remove();
        t.display();
        System.out.println(t.peek());
        System.out.println(t.size);
    }
}
