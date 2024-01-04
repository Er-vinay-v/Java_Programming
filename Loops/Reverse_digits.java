package Loops;
import java.util.Scanner;
public class Reverse_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a n digits number: ");
        int n=sc.nextInt();
        int reverse=0;
        int x=n;
        while(n>0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        System.out.println("reverse of digits "+x+" is: "+reverse);
    }
}
