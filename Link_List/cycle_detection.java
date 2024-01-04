package Link_List;

public class cycle_detection {
    static void cyc_detection(node head){
        node slow=head;
        node fast=head;
        while (fast!=null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast){
                System.out.println("The mitting point of cycle is: "+slow.data);
                break;
            }
        }
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node l1=new node(1);
        node l2=new node(2);
        node l3=new node(3);
        node l4=new node(4);
        node l5=new node(5);
        node l6=new node(6);

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        l4.next=l5;
        l5.next=l6;
        l6.next=l3;
        cyc_detection(l1);

    }
}
