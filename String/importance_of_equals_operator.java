package String;

public class importance_of_equals_operator {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String("hello");
        System.out.println(s1==s2);//output is true because it only compare address
        System.out.println(s1==s3);//out put is return false but really o/p is true because its address is not same
        System.out.println(s1.equals(s3));//it will given always right answer bcz it compar address as well as string
    }
}
