package Method;

public class max_val {
    static int max_val(int[]arr){
        int max=Integer.MIN_VALUE;
        int idx=0;
        for (int i=0;i<arr.length;i++){
            if (max<arr[i]){
                max=arr[i];
               // idx=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[]arr={3,4,6,5,9,8,12,1};
        int ans=max_val(arr);
        System.out.println(ans);
    }
}
