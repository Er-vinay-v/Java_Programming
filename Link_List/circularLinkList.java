package Link_List;

public class circularLinkList {
    public static class node{
        int val;
        node next;

        node(int val){
            this.val=val;
        }
    }
    static void display(node head){
        System.out.print(head.val+" ");
        System.out.print(head.next.val+" ");
        head=head.next;
        node temp=head.next;
        while(temp.next!=head){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static node deleteHead(node head){
        node temp=head.next;
        while(temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
        return head;
    }
    public static void main(String[] args) {
        node a=new node(3);
        node b=new node(5);
        node c=new node(15);
        node d=new node(30);
        node e=new node(60);
        node f=new node(120);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=a;
        display(a);
        //System.out.println(f.next.val);
      node ans=deleteHead(a);
      display(ans);
    }
}
