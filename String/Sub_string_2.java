package String;

public class Sub_string_2 {
    public static void main(String[] args) {
        String s="abc";
        for (int i=0;i<=s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
