package Pattern_printing;
import java.util.Scanner;
public class Number_pyramid_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int k=1;k<=i;k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
}
