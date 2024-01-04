package Date_time;

import java.util.Arrays;
import java.util.List;

public class LaunchFE {
    public static void main(String[] args) {
//        List<Integer> s=new ArrayList<>();
//        s.add(2);
//        s.add(4);
//        s.add(6);
//        s.add(7);
//        s.add(8);
//        System.out.println(s);

        List<Integer>s2= Arrays.asList(2,4,8,10,12,14);
        System.out.println(s2);
//        for (Integer i:s2){
//            System.out.print(i+" ");
//        }
//        System.out.println();

        //forEach loop with lambda expression for iteration
        s2.forEach(i-> System.out.print(i+" "));
    }
}
