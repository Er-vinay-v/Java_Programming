package One_dimensional_array;

public class Reverse1 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,12};
        System.out.println("Array length is : " + arr.length);
        for (int i=0, j=9;i<=j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" " );
        }
    }
}
