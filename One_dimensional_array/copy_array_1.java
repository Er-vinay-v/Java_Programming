package One_dimensional_array;

public class copy_array_1 {
    static int countOccurrence(int []arr,int x){  //this is method or function
        int count=0;
        int index=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
                index=i;
            }
        }
        System.out.println("Last occurrence of index x is  " +index);
        return count;

    }
    public static void main(String[] args) {
        int []arr={5,6,5,8,6,6};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("array occurrence x is  "+countOccurrence(arr,6));

    }
}
