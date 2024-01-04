package Two_D_Array;

import java.util.Scanner;

public class Add_2_array {
    static void Array(int [][]arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void sumToArray(int[][]arr ,int r1,int c1,int[][]brr,int r2,int c2){
        if (r1 != r2 || c1 !=c2){
            System.out.println("Addition is not possible");
            return;
        }
        int [][]sum=new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                sum[i][j]=arr[i][j]+brr[i][j];
            }
        }
        Array(sum);
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

        System.out.println("Output of original array arr");
        Array(arr);
        System.out.println("output of original array brr");
        Array(brr);

        System.out.println("sum array output is ");
        sumToArray(arr,r1,c1,brr,r2,c2);
    }
}
