package Pattern_printing;
import java.util.Scanner;
public class Rectangle_pattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows :");
        int r=sc.nextInt();
        System.out.println("Enter number of column :");
        int c=sc.nextInt();
        for (int i=1;i<=r;i++){
            for(int j=1;j<=c;j++) {
               if(i%2!=0){
                   System.out.print(j);
               }
               else{
                   char ch=(char)(j+64);
                   System.out.print(ch);
               }
            }
            System.out.println();

        }
    }
}
