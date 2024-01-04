package Two_D_Array;

import java.util.Scanner;

public class Rectangle_sum {
    static void PrintArray(int [][]arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int findSum(int [][]arr,int l1,int r1,int l2,int r2){
        int sum=0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum +=arr[i][j];

            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows");
        int n=sc.nextInt();
        System.out.println("Enter number of column");
        int m=sc.nextInt();
        System.out.println("Enter "+n*m+" elements");
        int [][]arr=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter coordinate l1");
        int l1=sc.nextInt();
        System.out.println("Enter coordinate r1");
        int r1=sc.nextInt();
        System.out.println("Enter coordinate l2");
        int l2=sc.nextInt();
        System.out.println("Enter coordinate r2");
        int r2=sc.nextInt();

        System.out.println("User input matrix");
        PrintArray(arr,n,m);
        System.out.println("Some of entered coordinate rectangle range is ");
        int sum=findSum(arr,l1,r1,l2,r2);
        System.out.println(sum);
    }
}
