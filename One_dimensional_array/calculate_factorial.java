package One_dimensional_array;

import java.util.Scanner;

public class calculate_factorial {
    static void factorial(int n){
        long ans=1;
        for (int i=1;i<=n;i++){
            ans*=i;
        }
        System.out.println("factorial of "+n+" is : "+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter which number of factorial you wnat");
        int n=sc.nextInt();
        factorial(n);
    }
}
