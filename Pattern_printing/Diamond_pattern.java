package Pattern_printing;
import java.util.Scanner;
public class Diamond_pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows and column :");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for(int j=n-i;j>=1;j--) System.out.print(" ");
            for(int k=i;k>=1;k--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
