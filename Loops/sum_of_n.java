package Loops;
import java.util.Scanner;
public class sum_of_n {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer no.:");
        int n=sc.nextInt();
//        int even=0;
//        int odd=0;
//        for (int i=1;i<=n;i++){
//            if(i%2==0){
//                even +=i;
//            }
//            else odd +=i;
//        }
//        int sum=even-odd;
//        System.out.println("sum of n no. is : "+sum);

        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum -=i;
            }
            else{
                sum +=i;
            }
        }
        System.out.println("sum of entered no is :"+sum);
    }
}
