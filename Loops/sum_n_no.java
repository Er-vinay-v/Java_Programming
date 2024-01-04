package Loops;
import java.util.Scanner;
public class sum_n_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer no");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("The sum of n number is :"+sum);
    }
}
