package If_else_statements;
import java.util.Scanner;
public class Loss_profit {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter cost price of item :");
        double cost=sc.nextDouble();
        System.out.println("Enter celling price of item :");
        double celling=sc.nextDouble();
        if(celling>cost) {
            double profit=celling-cost;
            System.out.println("The profit is :"+profit);
        }
        else {
            double lose=cost-celling;
            System.out.println("the lose is :"+lose);
        }
    }
}
