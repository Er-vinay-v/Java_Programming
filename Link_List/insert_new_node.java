package Link_List;

public class insert_new_node {
    static void display_recursively(node head){

        if (head.next==null)  {
            System.out.print(head.data+" ");
            return;
        }
       // System.out.print(head.data+" ");//non_reverse order
        display_recursively(head.next);
        System.out.print(head.data+" ");//reverse order
    }
    public static void insert_At_end(node head,int val){
        node t=new node(val);
        node temp=head;
        if(head==null){
            head.next=t;
            return;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=t;
    }
    public static void display(node head){
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
        node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        //creation of the nodes
        node l1=new node(1);

        node l2=new node(2);
        node l3=new node(3);
        node l4=new node(4);

        // links the node

        l1.next=l2;
        l2.next=l3;
        l3.next=l4;

        //display(l1);
        insert_At_end(l1,5);

        insert_At_end(l1,8);
        display(l1);
        display_recursively(l1);

    }
}
