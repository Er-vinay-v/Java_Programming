package Link_List;

public class display_length {
    static int displayLeng(val head){
        int length=0;
        while (head!=null){
            length++;
            head=head.next;

        }
        return length;
    }
    public static class val{
        int data;
        val next;
        val(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        val v1=new val(5);
        val v2=new val(8);
        val v3=new val(16);
        val v4=new val(18);
        val v5=new val(81);
        val v6=new val(100);

        v1.next=v2;
        v2.next=v3;
        v3.next=v4;
        v4.next=v5;
        v5.next=v6;
        int ans=displayLeng(v1);
        System.out.println(ans);

    }
}
