package One_dimensional_array;

public class some_of_pair_count {
    public static void main(String[] args) {
        int []arr={3,4,5,6,7,8,9,5,3,2};
        int x=13;
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==x){
                    count++;
                    System.out.println("(" +arr[i]+" "+arr[j] + ")");
                }
            }
        }
        System.out.println(count);

    }
}
