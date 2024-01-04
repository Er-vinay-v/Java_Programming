package One_dimensional_array;

public class Indexes_of_target_sum {
    public static void main(String[] args) {
        int []arr={4,5,7,6,8,3,2};
        int x=15;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++) {
                if (arr[i] + arr[j] == x) {
                    System.out.print("[ "+i+" "+j+" ]");

                }
            }
        }
    }
}
