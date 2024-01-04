package javainput;
import java.util.Scanner;
public class sum_of_two_no {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first no :");
        int a=sc.nextInt();
        System.out.println("Enter the second no :");
        int b=sc.nextInt();
        int sum=a+b;
        int pro=a*b;
        int mod=a%b;
        System.out.println("The sum of two no. is :"+sum);
        System.out.println("The product of two no is :"+pro);
        System.out.println("The remainder of two no is :"+mod);
    }
}
