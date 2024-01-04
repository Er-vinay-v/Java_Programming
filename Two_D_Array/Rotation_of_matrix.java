package Two_D_Array;

import java.util.Scanner;

public class Rotation_of_matrix {
    static void Print_Array(int [][]arr,int r,int c){
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void transposeMatrix(int [][]arr,int r,int c) {
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    static void reverseTransPoseMatrix(int []arr){
        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate(int[][]arr,int n){
        transposeMatrix(arr,n,n);
        for (int i=0;i<n;i++){
            reverseTransPoseMatrix(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows ");
        int r=sc.nextInt();
        System.out.println("Enter no. of columns");
        int c=sc.nextInt();
        System.out.println("Enter "+r*c+" elements");
        int [][]arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrices without transpose");
        Print_Array(arr,r,c);

        System.out.println("Matrices after transpose");
        transposeMatrix(arr,r,c);
        Print_Array(arr,r,c);
        System.out.println("Rotate of matrix");
        rotate(arr,r);
        Print_Array(arr,r,c);
    }
}
