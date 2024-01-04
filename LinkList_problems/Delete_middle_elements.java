package LinkList_problems;

public class Delete_middle_elements {
    static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static void delete(node head){
        node slow=head;
        node fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node l1=new node(5);
        node l2=new node(6);
        node l3=new node(8);
        node l4=new node(9);
        node l5=new node(51);
        node l6=new node(61);
        node l7=new node(85);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l7;

        display(l1);
        delete(l1);
        display(l1);
        
    }
}
