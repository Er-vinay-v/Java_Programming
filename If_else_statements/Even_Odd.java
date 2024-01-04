package If_else_statements;
import java.util.Scanner;
public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer no. :");
        int a=sc.nextInt();
        if (a%2==0){
            System.out.println("Number is even.");
        }
        else System.out.println("Number is odd.");
    }
}
