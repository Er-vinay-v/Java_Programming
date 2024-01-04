package Collection_Frame_Work;
import java.util.*;
public class LaunchAL {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add(3);
        l.add(5);
        l.add(8);
        l.add(9);
        l.add(3.4);
        System.out.println(l);

        ArrayList l2=new ArrayList();

        l2.add("vinay");
        l2.add(2.4);
        l2.add('V');
        l2.add(5);
        System.out.println(l2);
        l2.addAll(l);

        ArrayList l3=new ArrayList();
        l3.addAll(l2);
        l3.add(12);
        l3.add("soni");
        l3.add(100);
        System.out.println(l3);

    }
}
