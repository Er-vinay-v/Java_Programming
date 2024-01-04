package One_dimensional_array;

public class palindrome {
    public static void main(String[] args) {
        int []arr={1,2,3,4,3,2,1};
        System.out.println(arr.length);
        int i=0;
        int k=6;
        while(i<k){
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            i++;
            k--;
            if (arr[i]==arr[k]){
                System.out.println("Array is palindrome:");
                break;
            }
            else System.out.println("Array is not a palindrome:");
            break;

        }
    }
}
