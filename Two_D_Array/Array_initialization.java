package Two_D_Array;

public class Array_initialization {
    public static void main(String[] args) {
          int [][]arr=new int[2][3]; //basic approach for array initialization
        int [][]arr2={{1,2, 3},{4 ,5 ,6}};

        for (int i=0;i<arr.length;i++){
            for (int k=0;k<arr[i].length;k++){
                System.out.print(arr2[i][k]+" ");
            }
           System.out.println();
        }
    }
}
