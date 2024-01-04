package One_dimensional_array;

public class copyarrayelements_newarray {
    public static void main(String[] args) {
        int []arr={4,5,6,7,8,9};
        int []brr=new int[arr.length];
        int j=0;
       for (int i=arr.length-1;i>=0;i--){
           brr[j++]=arr[i];
       }

        for (int i=0;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
    }
}
