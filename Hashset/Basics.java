package Hashset;

import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<String>st=new HashSet<>();
        st.add("Maya");
        st.add("Manvi");
        st.add("soni");
        st.add("Hallena");
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.contains("soni"));
        st.remove("Maya");
        System.out.println(st);//soni,hallena,manvi
        System.out.println(st.contains("Maya"));//false
        System.out.println(st.isEmpty());//false
    }
}
