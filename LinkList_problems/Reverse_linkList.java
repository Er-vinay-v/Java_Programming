package LinkList_problems;

import java.util.LinkedList;

public class Reverse_linkList {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    static void display(node head){
        node temp=head;
        if(temp==null){
            return;
        }
        System.out.print(temp.val+" ");
        display(temp.next);
    }
    static node reverse(node head){
        if(head.next==null){
            System.out.println();
            return head;
        }
        node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String[] args) {
        node a=new node(3);
        node b=new node(7);
        node c=new node(5);
        node d=new node(4);
        node e=new node(9);
        node f=new node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        a=reverse(a);
        display(a);
        
    }
}
