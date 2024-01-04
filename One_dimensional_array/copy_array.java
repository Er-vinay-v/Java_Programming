package One_dimensional_array;

import java.security.spec.RSAOtherPrimeInfo;

public class copy_array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7};
        int []brr=new int[7];
        System.out.println(arr.length);
        for (int i=0;i<arr.length;i++){
             brr[i]=arr[i];
            System.out.print(brr[i]+" ");
        }
    }
}
