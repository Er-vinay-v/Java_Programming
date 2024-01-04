package Link_List;

public class display_recursively {
    static void display(Node head){
        if (head==null){
            return;
        }
        System.out.print(head.data+" ");
        display(head.next);

    }
    static void displayReverse(Node head){
        if (head==null){
            return;
        }
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node x1=new Node(5);
        Node x2=new Node(10);
        Node x3=new Node(15);
        Node x4=new Node(20);
        Node x5=new Node(25);
        Node x6=new Node(26);

        //link the data from address
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        x5.next=x6;

        //call recursion function
        display(x1);
        System.out.println();
        displayReverse(x1);
    }
}
