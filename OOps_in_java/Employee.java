package OOps_in_java;

public class Employee {
    String name;
    int ep_id;
    String post;
    double salery;
   final String School_name="columbia public school giridih jharkhand";
    public Employee(String name,int ep_id,String post,double salery){
        this.name=name;
        this.ep_id=ep_id;
        this.post=post;
        this.salery=salery;

    }

    public static void main(String[] args) {
        Employee s1=new Employee("donald",6453,"JE",32500);
        s1.name="bablu prajapati";
        System.out.println("name: "+s1.name);
        System.out.println("eip_id: "+s1.ep_id);
        System.out.println("Post: "+s1.post);
        System.out.println("salery: "+s1.salery);
        System.out.println();

    }
}
