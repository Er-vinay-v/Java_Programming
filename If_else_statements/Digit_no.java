package If_else_statements;
import java.util.Scanner;
public class Digit_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a positive integer:");
        int n=sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("Entered input is a three digit no. "+n);
        }
        else System.out.println("Entered input is not a three digit no. "+n);
    }
}
