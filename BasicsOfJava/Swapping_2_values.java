package BasicsOfJava;

public class Swapping_2_values {
    static void swapping(int x,int y){
        System.out.println("Original value of a and b is :");
        System.out.println("value of a after some of a&b is :"+x);
        System.out.println("value of b after difference of a & b is :"+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("the value of a after swapping is :"+x);
        System.out.println("the value of b after swapping is :"+y);
    }
    public static void main(String[] args) {
        int a=8;
        int b=5;
        swapping(a,b);
    }
}
