package Loops;
import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a n digits integer no. : ");
        int n=sc.nextInt();
        int sum=0;
        int y=n;
        while(n>0){
            sum +=n%10;
            n=n/10;

        }
        System.out.println("The sum of "+y+" digits are : "+sum);
    }
}
