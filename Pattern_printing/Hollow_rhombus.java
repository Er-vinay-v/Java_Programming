package Pattern_printing;
import java.util.Scanner;
public class Hollow_rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows & column :");
        int r=sc.nextInt();

        for (int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=r;k++){
               if (i==1 || i==r || k==1 || k==r ){
                   System.out.print("_ ");
               }
               else System.out.print("  ");
            }
            System.out.println();

        }
    }
}


