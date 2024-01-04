package One_dimensional_array;
import java.util.Scanner;
public class Second_smallest_min_element {
    static int min_element(int []arr){
        int min=Integer.MAX_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
       return min;
    }
    static int second_min_value(int[]arr){
        int min=min_element(arr);
        for (int i=0;i<arr.length;i++){
            if(arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int s_min=min_element(arr);
        return s_min;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int[]arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
       System.out.println("1st Minimum value array elements : "+min_element(arr));
        System.out.println("2nd smallest array elements is "+second_min_value(arr));
    }
}
