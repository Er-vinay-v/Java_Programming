package Two_D_Array;

import java.util.Scanner;

public class Multiplication {
    static void Array(int [][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void multiplication(int [][]arr,int r1,int c1,int [][]brr,int r2,int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible because you entered wrong dimension");
            return;
        }
        int [][]mul=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    mul[i][j] +=arr[i][k]*brr[k][j];
                }
            }
        }
        System.out.println("Multiplication of two matrices");
        Array(mul);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int r1=sc.nextInt();
        System.out.println("Enter number of columns");
        int c1=sc.nextInt();
        System.out.println("Enter "+r1*c1+" elements");
        int [][]arr=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter number of rows of brr array");
        int r2=sc.nextInt();
        System.out.println("Enter number of columns of brr array");
        int c2=sc.nextInt();
        System.out.println("Enter "+r2*c2+" elements");
        int [][]brr=new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                brr[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
        Array(arr);
        System.out.println("Matrix 2");
        Array(brr);

        multiplication(arr,r1,c1,brr,r2,c2);
    }
}
