package javainput;
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int dividend,quotient,divisor;
        System.out.println("Enter dividend:");
         dividend=sc.nextInt();
        System.out.println("Enter divisor:");
         divisor=sc.nextInt();
         quotient =dividend/divisor;
        int remainder = dividend - (divisor *  quotient);
        System.out.println("The remainder of given input is :"+remainder);
    }
}
