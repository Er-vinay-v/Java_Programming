package BasicsOfJava;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st floating point no. :");
        float a=sc.nextFloat();
        System.out.println("Enter 2nd floating point no. :");
        float b=sc.nextFloat();
        float mul=a*b;
        System.out.println("multiplication of two floating point no. is :"+mul);
    }
}
