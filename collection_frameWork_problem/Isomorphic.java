package collection_frameWork_problem;

import java.util.HashMap;

public class Isomorphic {
    static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character>mp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            char sch=s.charAt(i);
            char tch=t.charAt(i);
            if (mp.containsKey(sch)){
                if (mp.get(sch)!=tch)return false;
            }else if(mp.containsValue(tch)){
                return false;
            }
            else{
                mp.put(sch,tch);
            }
        }
          return true;
    }
    public static void main(String[] args) {
        String s="aaac";
        String t="xxyz";
        boolean b=isIsomorphic(s,t);
        System.out.println(b);
    }
}
