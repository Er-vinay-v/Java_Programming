package One_dimensional_array;
import java.util.Scanner;
public class Rotation_of_array {
static int[]rotate(int[]arr,int k){
    int n=arr.length;
    k = k % n;
    int[]ans=new int[n];
    int j=0;
    for (int i=n-k;i<n;i++){
        ans[j++]=arr[i];
    }
    for (int i=0;i<n-k;i++){
        ans[j++]=arr[i];
    }
    return ans;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[]arr=new int[n];
        System.out.println("enter the array elements :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no. of rotation t");
        int t=sc.nextInt();
        int[]res=rotate(arr,t);
        for (var e:res){
            System.out.print(e+" ");
        }
    }
}
