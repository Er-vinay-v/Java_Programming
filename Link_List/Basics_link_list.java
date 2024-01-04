package Link_List;

public class Basics_link_list {
    public static void insertAtEnd(node head,int val){
        node temp=new node(val);
        node t=head;

        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }
    static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static class node{
        int data;//value
        node next;//address of next data
        node(int data){  //constructors
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node x1=new node(3);
        node x2=new node(5);
        node x3=new node(7);
        node x4=new node(9);
        node x5=new node(11);
        node y=new node(12);
        System.out.println(x1.next); //without link access the data
        x1.next=x2; //3->5 7 9 11
        x2.next=x3;//3->5->7 9 11
        x3.next=y;
        y.next=x4;//3->5->7->9 11
        x4.next=x5;//3->5->7->9-> 11
//        System.out.println(x1.data); //manually printing of link list data
//        System.out.println(x1.next.data);//after link access the data
//        System.out.println(x1.next.next.data);

//        node temp=x1;
//        for (int i=1;i<=6;i++){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }

        display(x1 );
        insertAtEnd(x1,80);
        display(x1);

    }
}
