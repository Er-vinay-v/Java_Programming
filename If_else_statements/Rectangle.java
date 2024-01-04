package If_else_statements;
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        int l=sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int b=sc.nextInt();
        int perimeter=2*(l+b);
        int Area=l*b;
        if(Area>perimeter) System.out.println("area is greater then perimeter"+Area);
else System.out.println("perimeter is greater then area :"+perimeter);
    }
}
