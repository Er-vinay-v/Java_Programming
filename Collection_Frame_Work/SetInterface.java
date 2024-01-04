package Collection_Frame_Work;

import java.util.HashSet;

public class SetInterface {
    public static void main(String[] args) {
        HashSet<Integer>h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(23);
        h.add(12);
        h.add(10);
        System.out.println(h);
        h.remove(3);
        System.out.println(h.contains(13));
        System.out.println(h.size());
    }
}
