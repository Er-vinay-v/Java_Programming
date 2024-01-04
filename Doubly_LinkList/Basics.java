package Doubly_LinkList;

public class Basics {
    public static class Node{
        int val;
        Node next;
        Node prev;

        //constructor
        Node(int val){
            this.val=val;
        }
    }
    static void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void reverse(Node tail){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }
        System.out.println();
    }
    static void forward(Node head){
        Node temp=head;
        while(temp.prev!=null){ //back to traverse the head node
            temp=temp.prev;
        }
        //display function in forward order
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static Node insertHead(Node head,int val){
        Node x=new Node(val);
        x.next=head;
        head.prev=x;
        head=head.prev;
        return head;
    }
    static Node insert_tail(Node head,Node tail,int val){
        Node x=new Node(val);
        tail.next=x;
        x.prev=tail;
        tail=tail.next;
        return head;
    }
    static void insretAt(Node head,int idx,int val){
        Node x=new Node(val);
        Node temp=head;
        for (int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        x.next=temp.next;
        temp.next=x;
        x.next.prev=x;
        x.prev=temp;

    }
    static void deleteAt(Node head,int idx){
        Node temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        Node agla=temp.next.next;
        temp.next=agla;
        agla.prev=temp;
    }
    public static void main(String[] args) {
        Node l1=new Node(1);
        Node l2=new Node(3);
        Node l3=new Node(5);
        Node l4=new Node(9);
        Node l5=new Node(11);
        Node l6=new Node(17);

        //linking the list in forward direction
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;

        // linking the list in reverse direction
        l6.prev=l5;
        l5.prev=l4;
        l4.prev=l3;
        l3.prev=l2;
        l2.prev=l1;
       display(l1);
//       reverse(l6);
//       forward(l5);
        Node ans=insertHead(l1,10);
        display(ans);
        Node q=insert_tail(ans,l6,50);
        display(q);
       insretAt(ans,5,24);
       display(ans);
        deleteAt(ans,5);
        display(ans);

    }
}
