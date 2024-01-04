package BasicsOfJava;

public class arithmetic {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=8;
        c=12;
        int f=(a+b)/c;
        System.out.print("The value of f is :");
        System.out.println(f);
        c=c*a+b;
        System.out.println("The value of c is :"+ c);
        c=c*(a+b);
        System.out.println("The updated value of c is :"+c);
    }
}
