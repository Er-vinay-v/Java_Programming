package String;

public class string_builder {
    public static void main(String[] args) {
        //stringbuilder():-it is used to avoid emutablity problem and we will change special character in string

       //stringBuilder function hava length 16 char but as per required we will change the length of stringBuilder;
        StringBuilder s=new StringBuilder("hello");
        System.out.println(s);
        s.setCharAt(0,'m');
        System.out.println(s);
        s.append("bhallo");
        System.out.println(s);
    }
}
