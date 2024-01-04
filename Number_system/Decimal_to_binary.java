package Number_system;
import java.util.Scanner;
public class Decimal_to_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal number :");
        int decimal_No=sc.nextInt();
        int binary_No=0;
        int power=1;//power 10
        while(decimal_No>0){
            int parity=decimal_No%2;
            binary_No +=(parity*power);
            power *=10;
            decimal_No /=2;

        }
        System.out.println("binary code of this decimal no. is : "+binary_No);
    }
}
