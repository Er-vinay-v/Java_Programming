package Pattern_printing;
import java.util.Scanner;
public class Rectangular_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r=sc.nextInt();
        System.out.println("Enter number of column :");
        int c=sc.nextInt();
        for (int i=0;i<=r;i++){
            for(int j=0;j<=c;j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
