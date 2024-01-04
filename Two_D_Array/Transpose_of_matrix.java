package Two_D_Array;

public class Transpose_of_matrix {             //Bruit force method iterative technique
    public static void main(String[] args) {
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Before transpose matrix");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After transpose matrix");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
