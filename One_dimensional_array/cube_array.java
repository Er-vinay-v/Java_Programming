package One_dimensional_array;

public class cube_array {
    public static void main(String[] args) {
        int []arr={2,3,4,5,6,7,8,9,12};
        int []brr=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            brr[i]=arr[i]*arr[i]*arr[i];
            System.out.print(brr[i]+" ");
        }
    }
}
