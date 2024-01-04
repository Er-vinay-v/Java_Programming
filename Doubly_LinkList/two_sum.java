package Doubly_LinkList;

public class two_sum {
    public static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val;
        }
    }
    static void targetSum(node head,int target){
        node h=head;
        node t=head;
        while(t.next!=null){
            t=t.next;
        }
        while(h.val<t.val){
            if(h.val+t.val==target){
                System.out.println(h.val+"+"+t.val+"="+target);
                return;
            }
            if(h.val+t.val>target){
                t=t.prev;
            }
            else{
                h=h.next;
            }
        }
    }
    public static void main(String[] args) {
        node a=new node(4);
        node b=new node(8);
        node c=new node(14);
        node d=new node(41);
        node e=new node(45);
        node f=new node(55);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        f.prev=e;
        e.prev=d;
        d.prev=c;
        c.prev=b;
        b.prev=a;

        targetSum(a,96);

    }
}
