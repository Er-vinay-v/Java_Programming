package Number_system;
import java.util.Scanner;
public class Binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a binary code :");
        int binary_code;
        binary_code=sc.nextInt();
        int decimal_code=0;
        int power=1; //2^0=1;
        while (binary_code > 0){
            int unit_digit=binary_code%10;
            decimal_code +=unit_digit*power;
            binary_code /=10;
            power *=2;
        }
        System.out.println("decimal number of this binary code  is "+decimal_code);
    }
}
