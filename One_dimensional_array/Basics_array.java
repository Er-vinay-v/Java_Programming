package One_dimensional_array;
import java.util.Scanner;
public class Basics_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[3]=56;
        arr[4]=78;
        arr[2]=100;
       // System.out.println(arr[4]);
        for (int i=0;i<=4;i++){
            System.out.println("Arr of index "+ i+ ":- "+ arr[i]);
        }
    }
}
