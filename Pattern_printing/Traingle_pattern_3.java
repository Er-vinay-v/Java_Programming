package Pattern_printing;
import java.util.Scanner;
public class Traingle_pattern_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r=sc.nextInt();
        System.out.println("Enter number of column :");
        int c=sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else {

                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
