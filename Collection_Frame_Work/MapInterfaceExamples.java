package Collection_Frame_Work;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExamples {
    public static void main(String[] args) {
        Map<Integer,String>m=new HashMap<>();
        m.put(1,"sony");
        m.put(14,"surya");
        m.put(79,"vinay");
        m.put(17,"donald");
        m.put(2,"rayan");
        System.out.println(m);
        System.out.println(m.containsKey(1));
        System.out.println(m.keySet());
        System.out.println(m.values());
    }
}
