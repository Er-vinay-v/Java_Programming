package Pattern_printing;
import java.util.Scanner;
public class Rhombus_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows & column :");
        int r=sc.nextInt();

        for (int i=1;i<=r;i++){
            for(int j=1;j<=r-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=r;k++){
                char ch=(char)(k+96);
                System.out.print(ch+" ");
            }
            System.out.println();

        }
    }
}

