package One_dimensional_array;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []arr=new int[10];
        int max=0;

        double avg=0;
        System.out.println("Enter the array elements :");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            avg +=arr[i];
            if(arr[i]>max){
                max=arr[i];
            }
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(avg);
        System.out.println(avg/arr.length);
        System.out.println(max);
        System.out.println(min);
    }
}
