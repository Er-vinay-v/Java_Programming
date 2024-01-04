package collection_frameWork_problem;

public class Two_sum {
    static void target_sum_idx(int[]arr,int x){
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j]==x){
                    System.out.printf("Target sum of those idx elements is (%d ,%d) \n",i,j);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 8, 9, 1, 2};
        int target=14;
        target_sum_idx(arr,target);
    }
}
