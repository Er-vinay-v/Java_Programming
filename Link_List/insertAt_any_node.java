package Link_List;

import java.util.Stack;

public class insertAt_any_node {
    public static void GetAt(node head,int idx){
        node temp=head;
        while(idx!=0){
            temp=temp.next;
            idx--;
        }
        System.out.println(temp.data);
    }
    static void reverse(node head){
        Stack<Integer>st=new Stack<>();
        node temp=head;
        while (temp!=null){
            st.push(temp.data);
            temp=temp.next;
        }
        while (st.size()!=0){
            System.out.print(st.pop()+" ");
        }
        System.out.println();
    }
    static void insertAt_idx(node head,int idx,int val){
        node temp=new node(val);
        node slow=head;
        node fast=head.next;
        while (idx!=0){
            slow=slow.next;
            fast=fast.next;
            idx--;
        }
        slow.next=temp;
        temp.next=fast;
    }
    static void delete(node head,int idx){
        node temp=head;
        while(idx>2){
            temp=temp.next;
            idx--;
        }
        temp.next=temp.next.next;
    }
    static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static class node{
        int data;
        node next;
        node(int data){this.data=data;}
    }
    public static void main(String[] args) {
        node l1=new node(1);
        node l2=new node (2);
        node l3=new node(4);
        node l4=new node(5);
        node l5=new node(6);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        display(l1);
//        insertAt_idx(l1,0 ,15);
//        insertAt_idx(l1,3,12);
//        display(l1);
//        delete(l1,7);
//        display(l1);
//        reverse(l1);
        GetAt(l1,1); // zero based indexed
    }
}
