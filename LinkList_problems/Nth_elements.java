package LinkList_problems;

public class Nth_elements {
    static node indexAt(node head,int idx){//search elements from last node int two traversal
        node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        temp=head;
        int m=size-idx+1;
        for (int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
    static node elementAt(node head,int n){//search elements from last node in one traverse
        node temp=head;
        node slow=head;
        node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    static void display(node head){//Link list display function
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static node DeleteAt(node head,int x){
        node slow=head;
        node fast=head;
        for (int i=1;i<=x;i++){
            fast=fast.next;
        }
        if (fast==null){
            head=head.next;
            return head;
        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node l1=new node(2);
        node l2=new node(3);
        node l3=new node(5);
        node l4=new node(9);
        node l5=new node(25);
        node l6=new node(30);
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        display(l1);
       node ans= indexAt(l1,2);//using two traversal
        System.out.println(ans.data);
        //System.out.println();
//        node x=elementAt(l1,5);//using one traversal
//          System.out.println(x.data);
//        display(l1);
//       l1= DeleteAt(l1,1);
//        display(l1);
    }
}
