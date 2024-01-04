package Loops;
import java.util.Scanner;
public class power_calculation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base  :");
        int b=sc.nextInt();

        System.out.println("Enter power  :");
        int p=sc.nextInt( );

        int ans=1;
        for(int i=1;i<=p;i++){
            ans *=b;
        }
        System.out.println("b to the power p is :"+ans);
    }
}

