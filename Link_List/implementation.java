package Link_List;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int length=0;
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if (head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            length++;
        }
        void insertAtHead(int val){
            Node temp=new Node(val);
            if (head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            length++;
        }
        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if (idx==length){
                insertAtEnd(val);
                return;
            }
            else if (idx==0){
                insertAtHead(val);
                return;
            }
            else if (idx<0 || idx>length){
                System.out.println("wrong idx");
                return;
            }
            for (int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            length++;
        }
        int getAt(int idx){
            Node temp=head;
            for (int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        void deleteAt(int idx){
            if (idx==0){
                head=head.next;
                length--;
                return;
            }
            Node temp=head;
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            length--;
        }
//         int length(){ //length will be manually calculated without traversing node to node
//            int count=0;
//            Node temp=head;
//            while(temp!=null){
//                count++;
//                temp=temp.next;
//            }
//            return count;
//        }
    }
    public static void main(String[] args) {
        linkedlist l1=new linkedlist();
        l1.insertAtEnd(5);
        l1.insertAtEnd(8);
        l1.insertAtEnd(12);
        l1.display();
        System.out.println();
        System.out.println("length of the linked list: "+l1.length);
        l1.insertAtEnd(123);
        l1.insertAtEnd(456);
        l1.display();
        System.out.println();
        System.out.println("length of the linked list: "+l1.length);
        l1.insertAtHead(4);
        l1.insertAtHead(3);
        l1.display();
        System.out.println();
        System.out.println("length is : "+l1.length);
        l1.insertAt(3,1);
        l1.insertAt(0,101);
        l1.insertAt(0,56);
        l1.display();
        System.out.println();
//        System.out.println(l1.tail.data);
//        System.out.println(l1.head.data);
        System.out.println(l1.getAt(0));
        l1.deleteAt(5);
        l1.display();
        System.out.println();
        l1.deleteAt(0);
        l1.display();
    }
}
