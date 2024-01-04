package Queue;

import java.util.LinkedList;

public class circular_linkList {
    public static class node {
        int val;
        node next;

        node(int val) {
            this.val = val;
        }
    }
        public static class cllq{
        node head=null;
        node tail=null;
        int size=0;
        void add(int val){
            node temp=new node(val);
            if(size==0){
                head=tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
                temp.next=head;
            }
            size++;
        }
        int remove()throws Exception{
            if (size==0){
                throw new Exception("queue is empty!");
            }
            int x=head.val;
            head=head.next;
            tail.next=head;
            size--;
            return x;
        }
        int peek()throws Exception{
            if (size==0){
                throw new Exception("queue is empty!");
            }
            return head.val;
        }
        int rare()throws Exception{
            if (size==0){
                throw new Exception("queue is empty!");
            }
            return tail.val;
        }
        boolean isEmpty(){
            if(size==0)return true;
            return false;
        }
        void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
            else{
                node temp=head;
                while(temp.next!=head){
                    System.out.print(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println(temp.val+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args)throws Exception {
        cllq l=new cllq();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.display();
        System.out.println(l.peek());
        System.out.println(l.size);
        l.remove();
        l.display();
        System.out.println(l.size);
        System.out.println(l.rare());
        System.out.println(l.isEmpty());

        l.remove();
        l.remove();
        l.add(12);
        l.display();
        System.out.println(l.size);
        System.out.println(l.peek());
        System.out.println(l.rare());
    }
}
