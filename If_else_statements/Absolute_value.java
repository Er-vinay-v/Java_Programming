package If_else_statements;
import java.util.Scanner;
public class Absolute_value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        if(n<0){
            n=n*(-1);
            System.out.println("Absolute value is :"+n);
        }
        else System.out.println("Absolute value is :"+n);
    }
}
