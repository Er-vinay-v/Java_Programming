package Collection_Frame_Work;

import java.util.HashMap;

public class Basics {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("soni",35);
        hm.put("shivani",21);
        hm.put("maya",20);
        hm.put("sonali",24);
        System.out.println(hm);
        System.out.println(hm.size());
        System.out.println(hm.remove("shivani"));
        System.out.println(hm.get("shivani"));
        System.out.println(hm);
    }
}
