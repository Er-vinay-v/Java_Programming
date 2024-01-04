package One_dimensional_array;

import java.util.Scanner;

public class Sum_of_nNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number of sum you want");
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sum=x+y;
            System.out.println(sum);
        }
    }
}
