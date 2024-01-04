package One_dimensional_array;
import java.util.Scanner;
public class even_array_elements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements :");
        int []arr=new int[6];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }

    }
}
