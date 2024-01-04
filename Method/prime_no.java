package Method;
import java.util.Scanner;
     public class prime_no {
         static void isprime(int x){
             for (int i=2;i<x/2;i++){
                 if (x%i==0){
                     System.out.println(x+" not a prime number");
                     break;
                 }else{
                     System.out.println(x+" is a prime number ");
                     break;
                 }
             }
         }
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("Enter a integer");
          int n=sc.nextInt();
          isprime(n);

    }
}
