package Method;
import java.util.*;
public class Method_overloading {
    static double Area(float r){
        double area_of_a_circle=Math.PI*r*r;
        return area_of_a_circle;
    }
    static int Area(int x,int y){
        int area=x*y;
        return area;
    }
    public static void main(String[] args) {
        float radious =5.6F;
        int ans=Area(4,9);
        System.out.println(ans);
    }
}
