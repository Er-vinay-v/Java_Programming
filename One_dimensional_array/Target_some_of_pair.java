package One_dimensional_array;
import java.util.Scanner;
public class Target_some_of_pair {
    static int target_some_of_pairs(int []arr,int  x){
        int Ans=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                for (int k=i+2;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==x){
                        Ans++;
                        System.out.println(arr[i]+" " +arr[j]+" "+arr[k]);
                    }
                }
            }
        }
        return Ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        System.out.println("enter the array elements :");
        int []arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of x  :");
        int y=sc.nextInt();
        System.out.println("Target some of pairs is : "+target_some_of_pairs(arr,y));
    }
}
