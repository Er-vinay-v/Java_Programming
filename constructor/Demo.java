package constructor;

public class Demo {
    private int a;
    private int b;

   public Demo(){
        System.out.println("zero parameterized constructor by programmer");
    }
    public Demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
        Demo d2=new Demo(12,13);
        d2.display();
    }
}
