package javainput;
import java.util.Scanner;
public class Area_of_circle {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the radius of circle :");
int radius=sc.nextInt();
double pi=3.1415;
double Area=pi*radius*radius;
        System.out.println("Area of circle is : "+Area);

    }
}
