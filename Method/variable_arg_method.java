package Method;

public class variable_arg_method {
    static void var_arg(int...x){
        for (int i:x){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        var_arg(3,4,5,6,7,8);
        System.out.println();
        var_arg(new int[]{4,5,6,7,8,89,9,34});
    }
}
