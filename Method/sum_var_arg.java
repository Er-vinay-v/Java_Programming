package Method;

public class sum_var_arg {
    static void sum(int...x){
        int ans=0;
        for (int i:x){
            ans+=i;
        }
        System.out.println("sum of all the variable arg elements "+ans);
    }
    public static void main(String[] args) {
        sum(4,5,6,7,45,7,9);
    }
}
