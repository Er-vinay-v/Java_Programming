package One_dimensional_array;
import java.util.Scanner;
public class Second_max_elements {
    static int SecondMx( int[]arr){
       int Mx=Integer.MIN_VALUE;
       for (int i=0;i<arr.length;i++){
           if (arr[i]>Mx){
               Mx=arr[i];
           }
       }
       return Mx;
    }
    static int second_max(int []arr){
        int Mx=SecondMx(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==Mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int s_max=SecondMx(arr);
        return s_max;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the array elements :");
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
       // System.out.println("max elements is :"+SecondMx(arr));
        System.out.println("second max elements :"+second_max(arr));
    }
}
