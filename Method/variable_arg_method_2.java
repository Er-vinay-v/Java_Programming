package Method;

public class variable_arg_method_2 extends variable_arg_method {
    static void showList(int idx,String...s){
        for (int i=0;i<s.length;i++){
            System.out.println(idx+". "+s[i]);
            idx++;
        }
    }
    public static void main(String[] args) {

        showList(5,"Sonu","Sinu","shaurya","soni","donald");
    }
}
