package If_else_statements;
import java.util.Scanner;
public class Greatest_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no. :");
        int a=sc.nextInt();
        System.out.println("Enter the second no. :");
        int b=sc.nextInt();
        System.out.println("Enter third no.:");
        int c=sc.nextInt();
        if(a>b && a>c) System.out.println(a+" is greater then both.");
        else if(b>a && b>c) System.out.println(c+" is greatest.");
        else System.out.println(c+" is greatest.");
    }
}
