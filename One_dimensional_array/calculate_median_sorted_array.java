package One_dimensional_array;

public class calculate_median_sorted_array {
    public static double median(int a,int b){
        int x=a+b;
        if (x%2==1){
           int i=(x-1)/2;
           return (double) i+1;
        }
        return (double) (x+1)/2;
    }
    public static void main(String[] args) {
        int[]n1={2,5};
        int[]n2={5,1};
        int n=n1.length;
        int m=n2.length;
      double d=  median(n,m);
        System.out.println(d);
    }
}
