package Pattern_printing;
import java.util.Scanner;
public class Triangle_pattern_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r=sc.nextInt();
        System.out.println("Enter number of column :");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                char ch=(char)(j+64);
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
}

