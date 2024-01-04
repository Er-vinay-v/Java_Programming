package One_dimensional_array;
import java.util.Arrays;
import java.util.Scanner;
public class True_false_array {
    static boolean S_array(int []arr){
        boolean check=true;
        for (int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                check=false;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        System.out.println("Enter the array elements");
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("array is sorted : "+S_array(arr));
    }
}
