package One_dimensional_array;
import java.util.Scanner;
public class Count_greater_element_x {
    static int greater(int []arr,int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>x){
                count++;
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println("greater then x elements");
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("the no of array element is greater then x is "+greater(arr,9));
    }
}
