package If_else_statements;
import java.util.Scanner;
public class divisivle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive integer no. :");
        int s=sc.nextInt();
        if(s%5==0) System.out.println("It is divisible by 5 : ");
        else System.out.println("NOt divisible by 5 :");

    }
}
