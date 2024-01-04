package One_dimensional_array;

public class Array_Sort_1 {                    //non sorted technique;
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int j=arr.length-1;
        for (int i=0;i<j;i++){
            if (arr[i]%2!=0 && arr[j]%2==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j--;
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
