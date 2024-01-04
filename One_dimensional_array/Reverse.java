package One_dimensional_array;

public class Reverse {
    public static void main(String[] args) {
        int []arr={2,7,1,3,-4,5,8};
       //if we  know the length of array then this approach is useful;
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
            int temp=arr[0];
            arr[0]=arr[6];
            arr[6]=temp;

        }
        System.out.println();
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
