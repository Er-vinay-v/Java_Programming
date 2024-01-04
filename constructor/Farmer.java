package constructor;

import java.util.Scanner;
public class Farmer {
    int pa;
    float td;
    static float ri;
    float si;

    static // it is common for all the objects, so it make statics for good memory managements
    {
         ri=4.5f;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount required");
        pa=sc.nextInt();
        System.out.println("Enter the time duration ");
        td=sc.nextFloat();
       // ri=4.5f;
    }
    void compute(){
        si=(pa*ri*td)/100f;
    }
    void display(){
        System.out.println("Your simple interest for this time duration is "+si);
        System.out.println("Total amount with interest is "+(pa+si));
    }
    public static void main(String[] args) {
        Farmer f1=new Farmer();
        Farmer f2=new Farmer();

        f1.input();
        f1.compute();
        f1.display();

        f2.input();
        f2.compute();
        f2.display();
    }
}
