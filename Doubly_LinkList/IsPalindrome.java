package Doubly_LinkList;

public class IsPalindrome {
    public static class node{
        int val;
        node next;
        node prev;

        node(int val){
            this.val=val;
        }
    }
    static boolean isPalindrome(node head){
        node t1=head;
        node t2=head;
        while(t2.next!=null){
            t2=t2.next;
        }
        node tail=t2;
        while (t1!=t2){
            if (t1.val!=t2.val)return false;
            t1=t1.next;
            t2=t2.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        node l1=new node(1);
        node l2=new node(2);
        node l3=new node(5);
        node l4=new node(2);
        node l5=new node(1);

        l1.next=l2;
        l2.prev=l1;
        l2.next=l3;
        l3.prev=l2;
        l3.next=l4;
        l4.prev=l3;
        l4.next=l5;
        l5.prev=l4;
       boolean b= isPalindrome(l1);
        System.out.println(b);
    }
}
