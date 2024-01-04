package LinkList_problems;

public class Search_intersection_point {
    static node middleElements(node head){
        node slow=head;
        node fast=head;
        while(fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    static void display(node head){
        node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static node intersectPoint(node head1,node head2){
        node slow= head1;
        node fast=head2;
        int y=size(head1)-size(head2);
        for (int i=1;i<=y;i++){
            slow=slow.next;
        }
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    static int size(node head){
        node temp=head;
        int s=0;
        while (temp!=null){
            s++;
            temp=temp.next;
        }
        return s;
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node a1=new node(3);
        node a2=new node(4);
        node a3=new node(6);
        node a4=new node(8);
        node a5=new node(10);
        node a6=new node(14);
        node a7=new node(17);
        node a8=new node(20);

        node b1=new node(11);
        node b2=new node(12);

        a1.next=a2;
        a2.next=a3;
        a3.next=a7;
        a7.next=a8;
        a8.next=a4;
        a4.next=a5;
        a5.next=a6;


        b1.next=b2;
        b2.next=a4;

        System.out.println(a3.next.data);
        System.out.println(b2.next.data);

        int m=size(a1);
        System.out.println("length of first list: "+m);
        int n=size(b1);
        System.out.println("length of second list: "+n);
        System.out.println("first list:-");
        display(a1);
        System.out.println("second list:-");
        display(b1);
        node p=intersectPoint(a1,b1);
        System.out.println("Both the list intersects on the elements of: "+p.data);

        node q=middleElements(a1);
        System.out.println(q.data);
    }
}
