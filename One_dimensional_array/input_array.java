package One_dimensional_array;
import java.util.Scanner;
public class input_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr=new int[5];
        System.out.println("Enter the array element :");
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
    }
}