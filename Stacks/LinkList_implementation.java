package Stacks;

public class LinkList_implementation {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static class stack{
       private node head=null;
       private int size=0;
        void push(int x){
            node temp=new node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        void pop(){
            if(head==null){
                System.out.println("stack is empty!");
                return;
            }
            else {
                head = head.next;
            }
            size--;
        }
        int peek(){
            if(head==null){
                System.out.println("stack is empty!");
                return -1;
            }
            return head.val;
        }
        int size(){
            return size;
        }
        void displayrec(node h){
            if (h==null)return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(head);
            System.out.println();
        }
        void displayRev(){
            node t=head;
        while(t!=null){
        System.out.print(t.val+" ");
        t=t.next;
        }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        stack st=new stack();
        st.push(5);
        st.push(8);
        st.push(10);
        st.push(12);
        st.push(13);
        st.display();
        System.out.println("size is :"+st.size());
        st.pop();
        st.display();
        System.out.println("size is :"+st.size());
        System.out.println(st.peek());
    }
}
